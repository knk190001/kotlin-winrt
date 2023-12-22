package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.Geometry
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITabViewItemTemplateSettings2.ABI::class)
@Signature("{9e2780d3-7056-5aaf-9a7a-404a2c094ced}")
@Guid("9e2780d370565aaf9a7a404a2c094ced")
@WinRTInterface("9e2780d370565aaf9a7a404a2c094ced")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewItemTemplateSettings2.ByReference::class)
public interface ITabViewItemTemplateSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TabGeometry(): Geometry?

  @InterfaceMethod(1)
  public fun put_TabGeometry(value: Geometry?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewItemTemplateSettings2> {
    public override fun getValue() = ABI.makeITabViewItemTemplateSettings2(pointer.getPointer(0))

    public fun setValue(value: ITabViewItemTemplateSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewItemTemplateSettings2 {
    public val __1301602255_Ptr: Pointer?

    public val _1301602255_VtblPtr: Pointer?
      get() = __1301602255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TabGeometry(): Geometry? {
      val fnPtr = _1301602255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geometry>()
      val hr = fn.invokeHR(arrayOf(__1301602255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TabGeometry(value: Geometry?): Unit {
      val fnPtr = _1301602255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1301602255_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITabViewItemTemplateSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1301602255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewItemTemplateSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e2780d370565aaf9a7a404a2c094ced")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewItemTemplateSettings2(ptr: Pointer?): WithDefault =
        ITabViewItemTemplateSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewItemTemplateSettings2 {
      val address = segment.toRawLongValue()
      return makeITabViewItemTemplateSettings2(Pointer(address))
    }

    public override fun toNative(obj: ITabViewItemTemplateSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1301602255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewItemTemplateSettings2):
        Array<ITabViewItemTemplateSettings2?> = (elements as
        Array<ITabViewItemTemplateSettings2?>).castToImpl<ITabViewItemTemplateSettings2,ITabViewItemTemplateSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewItemTemplateSettings2?> =
        arrayOfNulls<ITabViewItemTemplateSettings2_Impl>(size) as
        Array<ITabViewItemTemplateSettings2?>
  }
}
