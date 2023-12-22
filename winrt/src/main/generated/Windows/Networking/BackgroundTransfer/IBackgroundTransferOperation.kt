package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBackgroundTransferOperation.ABI::class)
@Signature("{ded06846-90ca-44fb-8fb1-124154c0d539}")
@Guid("ded0684690ca44fb8fb1124154c0d539")
@WinRTInterface("ded0684690ca44fb8fb1124154c0d539")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferOperation.ByReference::class)
public interface IBackgroundTransferOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Guid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_RequestedUri(): Uri?

  @InterfaceMethod(2)
  public fun get_Method(): String?

  @InterfaceMethod(3)
  public fun get_Group(): String?

  @InterfaceMethod(4)
  public fun get_CostPolicy(): BackgroundTransferCostPolicy?

  @InterfaceMethod(5)
  public fun put_CostPolicy(value: BackgroundTransferCostPolicy?): Unit

  @InterfaceMethod(6)
  public fun GetResultStreamAt(position: WinDef.ULONG): IInputStream?

  @InterfaceMethod(7)
  public fun GetResponseInformation(): ResponseInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferOperation> {
    public override fun getValue() = ABI.makeIBackgroundTransferOperation(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferOperation {
    public val __1632478797_Ptr: Pointer?

    public val _1632478797_VtblPtr: Pointer?
      get() = __1632478797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Guid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestedUri(): Uri? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Method(): String? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Group(): String? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CostPolicy(): BackgroundTransferCostPolicy? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferCostPolicy>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferCostPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CostPolicy(value: BackgroundTransferCostPolicy?): Unit {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetResultStreamAt(position: WinDef.ULONG): IInputStream? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr, position, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetResponseInformation(): ResponseInformation? {
      val fnPtr = _1632478797_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResponseInformation>()
      val hr = fn.invokeHR(arrayOf(__1632478797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResponseInformation>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTransferOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632478797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ded0684690ca44fb8fb1124154c0d539")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferOperation(ptr: Pointer?): WithDefault =
        IBackgroundTransferOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferOperation {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferOperation(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632478797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferOperation):
        Array<IBackgroundTransferOperation?> = (elements as
        Array<IBackgroundTransferOperation?>).castToImpl<IBackgroundTransferOperation,IBackgroundTransferOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferOperation?> =
        arrayOfNulls<IBackgroundTransferOperation_Impl>(size) as
        Array<IBackgroundTransferOperation?>
  }
}
