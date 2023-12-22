package Windows.Devices.PointOfService

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IJournalPrinterCapabilities2.ABI::class)
@Signature("{03b0b645-33b8-533b-baaa-a4389283ab0a}")
@Guid("03b0b64533b8533bbaaaa4389283ab0a")
@WinRTInterface("03b0b64533b8533bbaaaa4389283ab0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IJournalPrinterCapabilities2.ByReference::class)
public interface IJournalPrinterCapabilities2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReverseVideoSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsStrikethroughSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsSuperscriptSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsSubscriptSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsReversePaperFeedByLineSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsReversePaperFeedByMapModeUnitSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IJournalPrinterCapabilities2> {
    public override fun getValue() = ABI.makeIJournalPrinterCapabilities2(pointer.getPointer(0))

    public fun setValue(value: IJournalPrinterCapabilities2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IJournalPrinterCapabilities2 {
    public val __248169626_Ptr: Pointer?

    public val _248169626_VtblPtr: Pointer?
      get() = __248169626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReverseVideoSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsStrikethroughSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsSuperscriptSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsSubscriptSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsReversePaperFeedByLineSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsReversePaperFeedByMapModeUnitSupported(): Boolean {
      val fnPtr = _248169626_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__248169626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IJournalPrinterCapabilities2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __248169626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IJournalPrinterCapabilities2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03b0b64533b8533bbaaaa4389283ab0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIJournalPrinterCapabilities2(ptr: Pointer?): WithDefault =
        IJournalPrinterCapabilities2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IJournalPrinterCapabilities2 {
      val address = segment.toRawLongValue()
      return makeIJournalPrinterCapabilities2(Pointer(address))
    }

    public override fun toNative(obj: IJournalPrinterCapabilities2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__248169626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IJournalPrinterCapabilities2):
        Array<IJournalPrinterCapabilities2?> = (elements as
        Array<IJournalPrinterCapabilities2?>).castToImpl<IJournalPrinterCapabilities2,IJournalPrinterCapabilities2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IJournalPrinterCapabilities2?> =
        arrayOfNulls<IJournalPrinterCapabilities2_Impl>(size) as
        Array<IJournalPrinterCapabilities2?>
  }
}
