package Microsoft.UI.Xaml

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveTrigger.ABI::class)
@Signature("{b2b18ae8-48d9-5a1d-a555-6685ddd4da80}")
@Guid("b2b18ae848d95a1da5556685ddd4da80")
@WinRTInterface("b2b18ae848d95a1da5556685ddd4da80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveTrigger.ByReference::class)
public interface IAdaptiveTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinWindowWidth(): Double

  @InterfaceMethod(1)
  public fun put_MinWindowWidth(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_MinWindowHeight(): Double

  @InterfaceMethod(3)
  public fun put_MinWindowHeight(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveTrigger> {
    public override fun getValue() = ABI.makeIAdaptiveTrigger(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveTrigger {
    public val __1164650693_Ptr: Pointer?

    public val _1164650693_VtblPtr: Pointer?
      get() = __1164650693_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinWindowWidth(): Double {
      val fnPtr = _1164650693_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1164650693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MinWindowWidth(value: Double): Unit {
      val fnPtr = _1164650693_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164650693_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MinWindowHeight(): Double {
      val fnPtr = _1164650693_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1164650693_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MinWindowHeight(value: Double): Unit {
      val fnPtr = _1164650693_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164650693_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1164650693_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2b18ae848d95a1da5556685ddd4da80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveTrigger(ptr: Pointer?): WithDefault = IAdaptiveTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveTrigger {
      val address = segment.toRawLongValue()
      return makeIAdaptiveTrigger(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1164650693_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveTrigger): Array<IAdaptiveTrigger?> = (elements as
        Array<IAdaptiveTrigger?>).castToImpl<IAdaptiveTrigger,IAdaptiveTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveTrigger?> =
        arrayOfNulls<IAdaptiveTrigger_Impl>(size) as Array<IAdaptiveTrigger?>
  }
}
