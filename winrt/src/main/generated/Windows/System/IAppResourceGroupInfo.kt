package Windows.System

import Windows.Foundation.Collections.IVector
import Windows.System.Diagnostics.ProcessDiagnosticInfo
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

@ABIMarker(IAppResourceGroupInfo.ABI::class)
@Signature("{b913f77a-e807-49f4-845e-7b8bdcfe8ee7}")
@Guid("b913f77ae80749f4845e7b8bdcfe8ee7")
@WinRTInterface("b913f77ae80749f4845e7b8bdcfe8ee7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupInfo.ByReference::class)
public interface IAppResourceGroupInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_IsShared(): Boolean

  @InterfaceMethod(2)
  public fun GetBackgroundTaskReports(): IVector<AppResourceGroupBackgroundTaskReport?>?

  @InterfaceMethod(3)
  public fun GetMemoryReport(): AppResourceGroupMemoryReport?

  @InterfaceMethod(4)
  public fun GetProcessDiagnosticInfos(): IVector<ProcessDiagnosticInfo?>?

  @InterfaceMethod(5)
  public fun GetStateReport(): AppResourceGroupStateReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupInfo> {
    public override fun getValue() = ABI.makeIAppResourceGroupInfo(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupInfo {
    public val __469813549_Ptr: Pointer?

    public val _469813549_VtblPtr: Pointer?
      get() = __469813549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _469813549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsShared(): Boolean {
      val fnPtr = _469813549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetBackgroundTaskReports():
        IVector<AppResourceGroupBackgroundTaskReport?>? {
      val fnPtr = _469813549_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppResourceGroupBackgroundTaskReport?>>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<AppResourceGroupBackgroundTaskReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetMemoryReport(): AppResourceGroupMemoryReport? {
      val fnPtr = _469813549_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupMemoryReport>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupMemoryReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetProcessDiagnosticInfos(): IVector<ProcessDiagnosticInfo?>? {
      val fnPtr = _469813549_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ProcessDiagnosticInfo?>>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ProcessDiagnosticInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetStateReport(): AppResourceGroupStateReport? {
      val fnPtr = _469813549_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupStateReport>()
      val hr = fn.invokeHR(arrayOf(__469813549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupStateReport>(result.getValue())
      return resultValue
    }
  }

  public class IAppResourceGroupInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __469813549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b913f77ae80749f4845e7b8bdcfe8ee7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupInfo(ptr: Pointer?): WithDefault =
        IAppResourceGroupInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupInfo {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__469813549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupInfo): Array<IAppResourceGroupInfo?> =
        (elements as
        Array<IAppResourceGroupInfo?>).castToImpl<IAppResourceGroupInfo,IAppResourceGroupInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupInfo?> =
        arrayOfNulls<IAppResourceGroupInfo_Impl>(size) as Array<IAppResourceGroupInfo?>
  }
}
