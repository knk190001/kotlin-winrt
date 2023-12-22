package Windows.Management

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.HResult
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IMdmSession.ABI::class)
@Signature("{fe89314c-8f64-4797-a9d7-9d88f86ae166}")
@Guid("fe89314c8f644797a9d79d88f86ae166")
@WinRTInterface("fe89314c8f644797a9d79d88f86ae166")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMdmSession.ByReference::class)
public interface IMdmSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Alerts(): IVectorView<MdmAlert?>?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_Id(): String?

  @InterfaceMethod(3)
  public fun get_State(): MdmSessionState?

  @InterfaceMethod(4)
  public fun AttachAsync(): IAsyncAction?

  @InterfaceMethod(5)
  public fun Delete(): Unit

  @InterfaceMethod(6)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun StartAsync(alerts: IIterable<MdmAlert?>?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMdmSession> {
    public override fun getValue() = ABI.makeIMdmSession(pointer.getPointer(0))

    public fun setValue(value: IMdmSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMdmSession {
    public val __1098332059_Ptr: Pointer?

    public val _1098332059_VtblPtr: Pointer?
      get() = __1098332059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Alerts(): IVectorView<MdmAlert?>? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MdmAlert?>>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MdmAlert?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Id(): String? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_State(): MdmSessionState? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MdmSessionState>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MdmSessionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AttachAsync(): IAsyncAction? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Delete(): Unit {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun StartAsync(alerts: IIterable<MdmAlert?>?): IAsyncAction? {
      val fnPtr = _1098332059_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1098332059_Ptr, marshalToNative(alerts), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMdmSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1098332059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMdmSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe89314c8f644797a9d79d88f86ae166")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMdmSession(ptr: Pointer?): WithDefault = IMdmSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMdmSession {
      val address = segment.toRawLongValue()
      return makeIMdmSession(Pointer(address))
    }

    public override fun toNative(obj: IMdmSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1098332059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMdmSession): Array<IMdmSession?> = (elements as
        Array<IMdmSession?>).castToImpl<IMdmSession,IMdmSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMdmSession?> =
        arrayOfNulls<IMdmSession_Impl>(size) as Array<IMdmSession?>
  }
}
