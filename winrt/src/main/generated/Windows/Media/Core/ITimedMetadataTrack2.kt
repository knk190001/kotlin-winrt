package Windows.Media.Core

import Windows.Media.Core.ITimedMetadataTrack.ABI.IID
import Windows.Media.Playback.MediaPlaybackItem
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedMetadataTrack2.ABI::class)
@Signature("{21b4b648-9f9d-40ba-a8f3-1a92753aef0b}")
@Guid("21b4b6489f9d40baa8f31a92753aef0b")
@WinRTInterface("21b4b6489f9d40baa8f31a92753aef0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataTrack2.ByReference::class)
public interface ITimedMetadataTrack2 : NativeMapped, IWinRTInterface, ITimedMetadataTrack,
    IMediaTrack {
  @InterfaceMethod(0)
  public fun get_PlaybackItem(): MediaPlaybackItem?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataTrack2> {
    public override fun getValue() = ABI.makeITimedMetadataTrack2(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataTrack2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataTrack2, ITimedMetadataTrack.WithDefault,
      IMediaTrack.WithDefault {
    public val __1842057608_Ptr: Pointer?

    public val _1842057608_VtblPtr: Pointer?
      get() = __1842057608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackItem(): MediaPlaybackItem? {
      val fnPtr = _1842057608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1842057608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1842057608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1842057608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataTrack2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITimedMetadataTrack, IMediaTrack
      {
    public override val __771862778_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1842057608_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1836839004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaTrack.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1842057608_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1842057608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataTrack2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21b4b6489f9d40baa8f31a92753aef0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataTrack2(ptr: Pointer?): WithDefault = ITimedMetadataTrack2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataTrack2 {
      val address = segment.toRawLongValue()
      return makeITimedMetadataTrack2(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataTrack2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1842057608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataTrack2): Array<ITimedMetadataTrack2?> =
        (elements as
        Array<ITimedMetadataTrack2?>).castToImpl<ITimedMetadataTrack2,ITimedMetadataTrack2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataTrack2?> =
        arrayOfNulls<ITimedMetadataTrack2_Impl>(size) as Array<ITimedMetadataTrack2?>
  }
}
