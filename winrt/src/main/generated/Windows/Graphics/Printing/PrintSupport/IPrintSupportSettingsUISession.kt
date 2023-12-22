package Windows.Graphics.Printing.PrintSupport

import Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicket
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintSupportSettingsUISession.ABI::class)
@Signature("{c6da2251-83c3-55e4-a0f8-5de8b062adbf}")
@Guid("c6da225183c355e4a0f85de8b062adbf")
@WinRTInterface("c6da225183c355e4a0f85de8b062adbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportSettingsUISession.ByReference::class)
public interface IPrintSupportSettingsUISession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SessionPrintTicket(): WorkflowPrintTicket?

  @InterfaceMethod(1)
  public fun get_DocumentTitle(): String?

  @InterfaceMethod(2)
  public fun get_LaunchKind(): SettingsLaunchKind?

  @InterfaceMethod(3)
  public fun UpdatePrintTicket(printTicket: WorkflowPrintTicket?): Unit

  @InterfaceMethod(4)
  public fun get_SessionInfo(): PrintSupportSessionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportSettingsUISession> {
    public override fun getValue() = ABI.makeIPrintSupportSettingsUISession(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportSettingsUISession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportSettingsUISession {
    public val __1455759657_Ptr: Pointer?

    public val _1455759657_VtblPtr: Pointer?
      get() = __1455759657_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionPrintTicket(): WorkflowPrintTicket? {
      val fnPtr = _1455759657_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WorkflowPrintTicket>()
      val hr = fn.invokeHR(arrayOf(__1455759657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WorkflowPrintTicket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DocumentTitle(): String? {
      val fnPtr = _1455759657_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1455759657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LaunchKind(): SettingsLaunchKind? {
      val fnPtr = _1455759657_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsLaunchKind>()
      val hr = fn.invokeHR(arrayOf(__1455759657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsLaunchKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UpdatePrintTicket(printTicket: WorkflowPrintTicket?): Unit {
      val fnPtr = _1455759657_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1455759657_Ptr, marshalToNative(printTicket),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SessionInfo(): PrintSupportSessionInfo? {
      val fnPtr = _1455759657_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintSupportSessionInfo>()
      val hr = fn.invokeHR(arrayOf(__1455759657_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintSupportSessionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportSettingsUISession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1455759657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportSettingsUISession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6da225183c355e4a0f85de8b062adbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportSettingsUISession(ptr: Pointer?): WithDefault =
        IPrintSupportSettingsUISession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintSupportSettingsUISession {
      val address = segment.toRawLongValue()
      return makeIPrintSupportSettingsUISession(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportSettingsUISession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1455759657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportSettingsUISession):
        Array<IPrintSupportSettingsUISession?> = (elements as
        Array<IPrintSupportSettingsUISession?>).castToImpl<IPrintSupportSettingsUISession,IPrintSupportSettingsUISession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSupportSettingsUISession?> =
        arrayOfNulls<IPrintSupportSettingsUISession_Impl>(size) as
        Array<IPrintSupportSettingsUISession?>
  }
}
