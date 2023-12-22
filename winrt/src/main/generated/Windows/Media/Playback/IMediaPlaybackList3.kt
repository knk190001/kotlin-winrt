package Windows.Media.Playback

import Windows.Foundation.IReference
import Windows.Media.Playback.IMediaPlaybackList2.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaPlaybackList3.ABI::class)
@Signature("{dd24bba9-bc47-4463-aa90-c18b7e5ffde1}")
@Guid("dd24bba9bc474463aa90c18b7e5ffde1")
@WinRTInterface("dd24bba9bc474463aa90c18b7e5ffde1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackList3.ByReference::class)
public interface IMediaPlaybackList3 : NativeMapped, IWinRTInterface, IMediaPlaybackList2,
    IMediaPlaybackList, IMediaPlaybackSource {
  @InterfaceMethod(0)
  public fun get_MaxPlayedItemsToKeepOpen(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun put_MaxPlayedItemsToKeepOpen(value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackList3> {
    public override fun getValue() = ABI.makeIMediaPlaybackList3(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackList3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackList3, IMediaPlaybackList2.WithDefault,
      IMediaPlaybackList.WithDefault, IMediaPlaybackSource.WithDefault {
    public val __1427515761_Ptr: Pointer?

    public val _1427515761_VtblPtr: Pointer?
      get() = __1427515761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPlayedItemsToKeepOpen(): IReference<WinDef.UINT>? {
      val fnPtr = _1427515761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1427515761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MaxPlayedItemsToKeepOpen(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _1427515761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1427515761_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlaybackList3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackList2,
      IMediaPlaybackList, IMediaPlaybackSource {
    public override val __1427515762_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1427515761_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1200877092_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackList.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1427515761_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1427515761_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1427515761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackList3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd24bba9bc474463aa90c18b7e5ffde1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackList3(ptr: Pointer?): WithDefault = IMediaPlaybackList3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackList3 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackList3(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackList3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1427515761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackList3): Array<IMediaPlaybackList3?> =
        (elements as
        Array<IMediaPlaybackList3?>).castToImpl<IMediaPlaybackList3,IMediaPlaybackList3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackList3?> =
        arrayOfNulls<IMediaPlaybackList3_Impl>(size) as Array<IMediaPlaybackList3?>
  }
}
