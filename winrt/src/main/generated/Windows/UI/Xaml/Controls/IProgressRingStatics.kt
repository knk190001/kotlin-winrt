package Windows.UI.Xaml.Controls

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

@ABIMarker(IProgressRingStatics.ABI::class)
@Signature("{e8b62507-4e2c-47d5-a54a-c6c48a5e6989}")
@Guid("e8b625074e2c47d5a54ac6c48a5e6989")
@WinRTInterface("e8b625074e2c47d5a54ac6c48a5e6989")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingStatics.ByReference::class)
public interface IProgressRingStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActiveProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressRingStatics> {
    public override fun getValue() = ABI.makeIProgressRingStatics(pointer.getPointer(0))

    public fun setValue(value: IProgressRingStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRingStatics {
    public val __1069393260_Ptr: Pointer?

    public val _1069393260_VtblPtr: Pointer?
      get() = __1069393260_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActiveProperty(): DependencyProperty? {
      val fnPtr = _1069393260_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1069393260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IProgressRingStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1069393260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8b625074e2c47d5a54ac6c48a5e6989")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingStatics(ptr: Pointer?): WithDefault = IProgressRingStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingStatics {
      val address = segment.toRawLongValue()
      return makeIProgressRingStatics(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1069393260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRingStatics): Array<IProgressRingStatics?> =
        (elements as
        Array<IProgressRingStatics?>).castToImpl<IProgressRingStatics,IProgressRingStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRingStatics?> =
        arrayOfNulls<IProgressRingStatics_Impl>(size) as Array<IProgressRingStatics?>
  }
}
