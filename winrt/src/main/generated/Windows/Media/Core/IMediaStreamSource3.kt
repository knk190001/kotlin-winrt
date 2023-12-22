package Windows.Media.Core

import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSource3.ABI::class)
@Signature("{6a2a2746-3ddd-4ddf-a121-94045ecf9440}")
@Guid("6a2a27463ddd4ddfa12194045ecf9440")
@WinRTInterface("6a2a27463ddd4ddfa12194045ecf9440")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSource3.ByReference::class)
public interface IMediaStreamSource3 : NativeMapped, IWinRTInterface, IMediaStreamSource,
    IMediaSource {
  @InterfaceMethod(0)
  public fun put_MaxSupportedPlaybackRate(value: IReference<Double>?): Unit

  @InterfaceMethod(1)
  public fun get_MaxSupportedPlaybackRate(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSource3> {
    public override fun getValue() = ABI.makeIMediaStreamSource3(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSource3, IMediaStreamSource.WithDefault,
      IMediaSource.WithDefault {
    public val __2058342889_Ptr: Pointer?

    public val _2058342889_VtblPtr: Pointer?
      get() = __2058342889_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_MaxSupportedPlaybackRate(value: IReference<Double>?): Unit {
      val fnPtr = _2058342889_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2058342889_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_MaxSupportedPlaybackRate(): IReference<Double>? {
      val fnPtr = _2058342889_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2058342889_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamSource, IMediaSource
      {
    public override val __2144608138_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342889_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342889_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2058342889_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a2a27463ddd4ddfa12194045ecf9440")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSource3(ptr: Pointer?): WithDefault = IMediaStreamSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSource3 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSource3(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2058342889_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSource3): Array<IMediaStreamSource3?> =
        (elements as
        Array<IMediaStreamSource3?>).castToImpl<IMediaStreamSource3,IMediaStreamSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSource3?> =
        arrayOfNulls<IMediaStreamSource3_Impl>(size) as Array<IMediaStreamSource3?>
  }
}
