package Windows.Media.Playback

import Windows.Media.Playback.IMediaPlaybackItem2.ABI.IID
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackItem3.ABI::class)
@Signature("{0d328220-b80a-4d09-9ff8-f87094a1c831}")
@Guid("0d328220b80a4d099ff8f87094a1c831")
@WinRTInterface("0d328220b80a4d099ff8f87094a1c831")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItem3.ByReference::class)
public interface IMediaPlaybackItem3 : NativeMapped, IWinRTInterface, IMediaPlaybackItem2,
    IMediaPlaybackItem, IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun get_IsDisabledInPlaybackList(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDisabledInPlaybackList(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TotalDownloadProgress(): Double

  @InterfaceMethod(3)
  public fun get_AutoLoadedDisplayProperties(): AutoLoadedDisplayPropertyKind?

  @InterfaceMethod(4)
  public fun put_AutoLoadedDisplayProperties(value: AutoLoadedDisplayPropertyKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItem3> {
    public override fun getValue() = ABI.makeIMediaPlaybackItem3(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItem3, IMediaPlaybackItem2.WithDefault,
      IMediaPlaybackItem.WithDefault, IMediaPlaybackSource.WithDefault {
    public val __1429972294_Ptr: Pointer?

    public val _1429972294_VtblPtr: Pointer?
      get() = __1429972294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDisabledInPlaybackList(): Boolean {
      val fnPtr = _1429972294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1429972294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDisabledInPlaybackList(value: Boolean): Unit {
      val fnPtr = _1429972294_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1429972294_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TotalDownloadProgress(): Double {
      val fnPtr = _1429972294_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1429972294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AutoLoadedDisplayProperties(): AutoLoadedDisplayPropertyKind? {
      val fnPtr = _1429972294_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoLoadedDisplayPropertyKind>()
      val hr = fn.invokeHR(arrayOf(__1429972294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoLoadedDisplayPropertyKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_AutoLoadedDisplayProperties(value: AutoLoadedDisplayPropertyKind?):
        Unit {
      val fnPtr = _1429972294_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1429972294_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackItem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackItem2,
      IMediaPlaybackItem, IMediaPlaybackSource {
    public override val __1429972295_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1429972294_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1200797849_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackItem.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1429972294_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1429972294_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1429972294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d328220b80a4d099ff8f87094a1c831")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItem3(ptr: Pointer?): WithDefault = IMediaPlaybackItem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItem3 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItem3(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1429972294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItem3): Array<IMediaPlaybackItem3?> =
        (elements as
        Array<IMediaPlaybackItem3?>).castToImpl<IMediaPlaybackItem3,IMediaPlaybackItem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItem3?> =
        arrayOfNulls<IMediaPlaybackItem3_Impl>(size) as Array<IMediaPlaybackItem3?>
  }
}
