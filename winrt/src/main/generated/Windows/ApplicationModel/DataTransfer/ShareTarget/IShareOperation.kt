package Windows.ApplicationModel.DataTransfer.ShareTarget

import Windows.ApplicationModel.DataTransfer.DataPackageView
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

@ABIMarker(IShareOperation.ABI::class)
@Signature("{2246bab8-d0f8-41c1-a82a-4137db6504fb}")
@Guid("2246bab8d0f841c1a82a4137db6504fb")
@WinRTInterface("2246bab8d0f841c1a82a4137db6504fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareOperation.ByReference::class)
public interface IShareOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): DataPackageView?

  @InterfaceMethod(1)
  public fun get_QuickLinkId(): String?

  @InterfaceMethod(2)
  public fun RemoveThisQuickLink(): Unit

  @InterfaceMethod(3)
  public fun ReportStarted(): Unit

  @InterfaceMethod(4)
  public fun ReportDataRetrieved(): Unit

  @InterfaceMethod(5)
  public fun ReportSubmittedBackgroundTask(): Unit

  @InterfaceMethod(6)
  public fun ReportCompleted(quicklink: QuickLink?): Unit

  @InterfaceMethod(7)
  public fun ReportCompleted(): Unit

  @InterfaceMethod(8)
  public fun ReportError(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareOperation> {
    public override fun getValue() = ABI.makeIShareOperation(pointer.getPointer(0))

    public fun setValue(value: IShareOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareOperation {
    public val __431149936_Ptr: Pointer?

    public val _431149936_VtblPtr: Pointer?
      get() = __431149936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): DataPackageView? {
      val fnPtr = _431149936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_QuickLinkId(): String? {
      val fnPtr = _431149936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemoveThisQuickLink(): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ReportStarted(): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ReportDataRetrieved(): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ReportSubmittedBackgroundTask(): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun ReportCompleted(quicklink: QuickLink?): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, marshalToNative(quicklink),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ReportError(value: String?): Unit {
      val fnPtr = _431149936_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__431149936_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __431149936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2246bab8d0f841c1a82a4137db6504fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareOperation(ptr: Pointer?): WithDefault = IShareOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareOperation {
      val address = segment.toRawLongValue()
      return makeIShareOperation(Pointer(address))
    }

    public override fun toNative(obj: IShareOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__431149936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareOperation): Array<IShareOperation?> = (elements as
        Array<IShareOperation?>).castToImpl<IShareOperation,IShareOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareOperation?> =
        arrayOfNulls<IShareOperation_Impl>(size) as Array<IShareOperation?>
  }
}
