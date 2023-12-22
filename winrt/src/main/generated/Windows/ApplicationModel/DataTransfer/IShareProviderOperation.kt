package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IShareProviderOperation.ABI::class)
@Signature("{19cef937-d435-4179-b6af-14e0492b69f6}")
@Guid("19cef937d4354179b6af14e0492b69f6")
@WinRTInterface("19cef937d4354179b6af14e0492b69f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareProviderOperation.ByReference::class)
public interface IShareProviderOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): DataPackageView?

  @InterfaceMethod(1)
  public fun get_Provider(): ShareProvider?

  @InterfaceMethod(2)
  public fun ReportCompleted(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareProviderOperation> {
    public override fun getValue() = ABI.makeIShareProviderOperation(pointer.getPointer(0))

    public fun setValue(value: IShareProviderOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareProviderOperation {
    public val __618575455_Ptr: Pointer?

    public val _618575455_VtblPtr: Pointer?
      get() = __618575455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): DataPackageView? {
      val fnPtr = _618575455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__618575455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Provider(): ShareProvider? {
      val fnPtr = _618575455_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareProvider>()
      val hr = fn.invokeHR(arrayOf(__618575455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _618575455_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618575455_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IShareProviderOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __618575455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareProviderOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19cef937d4354179b6af14e0492b69f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareProviderOperation(ptr: Pointer?): WithDefault =
        IShareProviderOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareProviderOperation {
      val address = segment.toRawLongValue()
      return makeIShareProviderOperation(Pointer(address))
    }

    public override fun toNative(obj: IShareProviderOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__618575455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareProviderOperation): Array<IShareProviderOperation?>
        = (elements as
        Array<IShareProviderOperation?>).castToImpl<IShareProviderOperation,IShareProviderOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareProviderOperation?> =
        arrayOfNulls<IShareProviderOperation_Impl>(size) as Array<IShareProviderOperation?>
  }
}
