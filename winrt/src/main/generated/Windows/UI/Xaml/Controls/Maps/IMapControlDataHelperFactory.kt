package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControlDataHelperFactory.ABI::class)
@Signature("{3b70aa8e-02ef-469c-bbaf-dc2158d4289b}")
@Guid("3b70aa8e02ef469cbbafdc2158d4289b")
@WinRTInterface("3b70aa8e02ef469cbbafdc2158d4289b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlDataHelperFactory.ByReference::class)
public interface IMapControlDataHelperFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(map: MapControl?): MapControlDataHelper?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlDataHelperFactory> {
    public override fun getValue() = ABI.makeIMapControlDataHelperFactory(pointer.getPointer(0))

    public fun setValue(value: IMapControlDataHelperFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlDataHelperFactory {
    public val __91759712_Ptr: Pointer?

    public val _91759712_VtblPtr: Pointer?
      get() = __91759712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(map: MapControl?): MapControlDataHelper? {
      val fnPtr = _91759712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapControlDataHelper>()
      val hr = fn.invokeHR(arrayOf(__91759712_Ptr, marshalToNative(map), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapControlDataHelper>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlDataHelperFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __91759712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlDataHelperFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b70aa8e02ef469cbbafdc2158d4289b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlDataHelperFactory(ptr: Pointer?): WithDefault =
        IMapControlDataHelperFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlDataHelperFactory {
      val address = segment.toRawLongValue()
      return makeIMapControlDataHelperFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapControlDataHelperFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__91759712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlDataHelperFactory):
        Array<IMapControlDataHelperFactory?> = (elements as
        Array<IMapControlDataHelperFactory?>).castToImpl<IMapControlDataHelperFactory,IMapControlDataHelperFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlDataHelperFactory?> =
        arrayOfNulls<IMapControlDataHelperFactory_Impl>(size) as
        Array<IMapControlDataHelperFactory?>
  }
}
