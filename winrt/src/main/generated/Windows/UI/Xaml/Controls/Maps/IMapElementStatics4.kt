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

@ABIMarker(IMapElementStatics4.ABI::class)
@Signature("{a4296f0b-dff8-467c-9315-6f6db93ee2ba}")
@Guid("a4296f0bdff8467c93156f6db93ee2ba")
@WinRTInterface("a4296f0bdff8467c93156f6db93ee2ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementStatics4.ByReference::class)
public interface IMapElementStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementStatics4> {
    public override fun getValue() = ABI.makeIMapElementStatics4(pointer.getPointer(0))

    public fun setValue(value: IMapElementStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementStatics4 {
    public val __1955796416_Ptr: Pointer?

    public val _1955796416_VtblPtr: Pointer?
      get() = __1955796416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabledProperty(): DependencyProperty? {
      val fnPtr = _1955796416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1955796416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1955796416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4296f0bdff8467c93156f6db93ee2ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementStatics4(ptr: Pointer?): WithDefault = IMapElementStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementStatics4 {
      val address = segment.toRawLongValue()
      return makeIMapElementStatics4(Pointer(address))
    }

    public override fun toNative(obj: IMapElementStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1955796416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementStatics4): Array<IMapElementStatics4?> =
        (elements as
        Array<IMapElementStatics4?>).castToImpl<IMapElementStatics4,IMapElementStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementStatics4?> =
        arrayOfNulls<IMapElementStatics4_Impl>(size) as Array<IMapElementStatics4?>
  }
}
