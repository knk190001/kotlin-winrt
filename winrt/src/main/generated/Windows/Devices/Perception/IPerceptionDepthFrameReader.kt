package Windows.Devices.Perception

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPerceptionDepthFrameReader.ABI::class)
@Signature("{b1a3c09f-299b-4612-a4f7-270f25a096ec}")
@Guid("b1a3c09f299b4612a4f7270f25a096ec")
@WinRTInterface("b1a3c09f299b4612a4f7270f25a096ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameReader.ByReference::class)
public interface IPerceptionDepthFrameReader : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_FrameArrived(handler: TypedEventHandler<PerceptionDepthFrameReader?,
      PerceptionDepthFrameArrivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_FrameArrived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Source(): PerceptionDepthFrameSource?

  @InterfaceMethod(3)
  public fun get_IsPaused(): Boolean

  @InterfaceMethod(4)
  public fun put_IsPaused(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun TryReadLatestFrame(): PerceptionDepthFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthFrameReader> {
    public override fun getValue() = ABI.makeIPerceptionDepthFrameReader(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameReader, IClosable.WithDefault {
    public val __2039744742_Ptr: Pointer?

    public val _2039744742_VtblPtr: Pointer?
      get() = __2039744742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_FrameArrived(handler: TypedEventHandler<PerceptionDepthFrameReader?,
        PerceptionDepthFrameArrivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_FrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Source(): PerceptionDepthFrameSource? {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionDepthFrameSource>()
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionDepthFrameSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsPaused(): Boolean {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsPaused(value: Boolean): Unit {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TryReadLatestFrame(): PerceptionDepthFrame? {
      val fnPtr = _2039744742_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionDepthFrame>()
      val hr = fn.invokeHR(arrayOf(__2039744742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionDepthFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthFrameReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2039744742_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2039744742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1a3c09f299b4612a4f7270f25a096ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameReader(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionDepthFrameReader {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameReader(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039744742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameReader):
        Array<IPerceptionDepthFrameReader?> = (elements as
        Array<IPerceptionDepthFrameReader?>).castToImpl<IPerceptionDepthFrameReader,IPerceptionDepthFrameReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameReader?> =
        arrayOfNulls<IPerceptionDepthFrameReader_Impl>(size) as Array<IPerceptionDepthFrameReader?>
  }
}
