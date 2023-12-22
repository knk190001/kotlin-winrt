package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMapControlStatics7.ABI::class)
@Signature("{55f1ac4d-72c2-46b2-b7ae-790260be641b}")
@Guid("55f1ac4d72c246b2b7ae790260be641b")
@WinRTInterface("55f1ac4d72c246b2b7ae790260be641b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics7.ByReference::class)
public interface IMapControlStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RegionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics7> {
    public override fun getValue() = ABI.makeIMapControlStatics7(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics7 {
    public val __142000220_Ptr: Pointer?

    public val _142000220_VtblPtr: Pointer?
      get() = __142000220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RegionProperty(): DependencyProperty? {
      val fnPtr = _142000220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55f1ac4d72c246b2b7ae790260be641b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics7(ptr: Pointer?): WithDefault = IMapControlStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics7 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics7(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics7): Array<IMapControlStatics7?> =
        (elements as
        Array<IMapControlStatics7?>).castToImpl<IMapControlStatics7,IMapControlStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics7?> =
        arrayOfNulls<IMapControlStatics7_Impl>(size) as Array<IMapControlStatics7?>
  }
}
