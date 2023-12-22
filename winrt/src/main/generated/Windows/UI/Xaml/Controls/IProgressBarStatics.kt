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

@ABIMarker(IProgressBarStatics.ABI::class)
@Signature("{7a129fda-5837-4e26-b3b4-e1c092cebbec}")
@Guid("7a129fda58374e26b3b4e1c092cebbec")
@WinRTInterface("7a129fda58374e26b3b4e1c092cebbec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBarStatics.ByReference::class)
public interface IProgressBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsIndeterminateProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ShowErrorProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ShowPausedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressBarStatics> {
    public override fun getValue() = ABI.makeIProgressBarStatics(pointer.getPointer(0))

    public fun setValue(value: IProgressBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBarStatics {
    public val __1275561819_Ptr: Pointer?

    public val _1275561819_VtblPtr: Pointer?
      get() = __1275561819_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsIndeterminateProperty(): DependencyProperty? {
      val fnPtr = _1275561819_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1275561819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShowErrorProperty(): DependencyProperty? {
      val fnPtr = _1275561819_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1275561819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ShowPausedProperty(): DependencyProperty? {
      val fnPtr = _1275561819_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1275561819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IProgressBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1275561819_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a129fda58374e26b3b4e1c092cebbec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarStatics(ptr: Pointer?): WithDefault = IProgressBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarStatics {
      val address = segment.toRawLongValue()
      return makeIProgressBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1275561819_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarStatics): Array<IProgressBarStatics?> =
        (elements as
        Array<IProgressBarStatics?>).castToImpl<IProgressBarStatics,IProgressBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarStatics?> =
        arrayOfNulls<IProgressBarStatics_Impl>(size) as Array<IProgressBarStatics?>
  }
}
