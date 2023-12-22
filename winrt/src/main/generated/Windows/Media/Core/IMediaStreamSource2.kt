package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaStreamSource.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSource2.ABI::class)
@Signature("{ec55d0ad-2e6a-4f74-adbb-b562d1533849}")
@Guid("ec55d0ad2e6a4f74adbbb562d1533849")
@WinRTInterface("ec55d0ad2e6a4f74adbbb562d1533849")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSource2.ByReference::class)
public interface IMediaStreamSource2 : NativeMapped, IWinRTInterface, IMediaStreamSource,
    IMediaSource {
  @InterfaceMethod(0)
  public fun add_SampleRendered(handler: TypedEventHandler<MediaStreamSource?,
      MediaStreamSourceSampleRenderedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SampleRendered(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSource2> {
    public override fun getValue() = ABI.makeIMediaStreamSource2(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSource2, IMediaStreamSource.WithDefault,
      IMediaSource.WithDefault {
    public val __2058342888_Ptr: Pointer?

    public val _2058342888_VtblPtr: Pointer?
      get() = __2058342888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SampleRendered(handler: TypedEventHandler<MediaStreamSource?,
        MediaStreamSourceSampleRenderedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2058342888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2058342888_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SampleRendered(token: EventRegistrationToken?): Unit {
      val fnPtr = _2058342888_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2058342888_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamSource, IMediaSource
      {
    public override val __2144608138_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342888_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342888_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2058342888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec55d0ad2e6a4f74adbbb562d1533849")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSource2(ptr: Pointer?): WithDefault = IMediaStreamSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSource2 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSource2(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2058342888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSource2): Array<IMediaStreamSource2?> =
        (elements as
        Array<IMediaStreamSource2?>).castToImpl<IMediaStreamSource2,IMediaStreamSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSource2?> =
        arrayOfNulls<IMediaStreamSource2_Impl>(size) as Array<IMediaStreamSource2?>
  }
}
