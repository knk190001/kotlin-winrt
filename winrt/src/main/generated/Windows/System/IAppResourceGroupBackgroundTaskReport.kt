package Windows.System

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

@ABIMarker(IAppResourceGroupBackgroundTaskReport.ABI::class)
@Signature("{2566e74e-b05d-40c2-9dc1-1a4f039ea120}")
@Guid("2566e74eb05d40c29dc11a4f039ea120")
@WinRTInterface("2566e74eb05d40c29dc11a4f039ea120")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupBackgroundTaskReport.ByReference::class)
public interface IAppResourceGroupBackgroundTaskReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_Trigger(): String?

  @InterfaceMethod(3)
  public fun get_EntryPoint(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupBackgroundTaskReport> {
    public override fun getValue() =
        ABI.makeIAppResourceGroupBackgroundTaskReport(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupBackgroundTaskReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupBackgroundTaskReport {
    public val __770774374_Ptr: Pointer?

    public val _770774374_VtblPtr: Pointer?
      get() = __770774374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _770774374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__770774374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _770774374_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__770774374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Trigger(): String? {
      val fnPtr = _770774374_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__770774374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_EntryPoint(): String? {
      val fnPtr = _770774374_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__770774374_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppResourceGroupBackgroundTaskReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __770774374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupBackgroundTaskReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2566e74eb05d40c29dc11a4f039ea120")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupBackgroundTaskReport(ptr: Pointer?): WithDefault =
        IAppResourceGroupBackgroundTaskReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupBackgroundTaskReport {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupBackgroundTaskReport(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupBackgroundTaskReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__770774374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupBackgroundTaskReport):
        Array<IAppResourceGroupBackgroundTaskReport?> = (elements as
        Array<IAppResourceGroupBackgroundTaskReport?>).castToImpl<IAppResourceGroupBackgroundTaskReport,IAppResourceGroupBackgroundTaskReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupBackgroundTaskReport?> =
        arrayOfNulls<IAppResourceGroupBackgroundTaskReport_Impl>(size) as
        Array<IAppResourceGroupBackgroundTaskReport?>
  }
}
