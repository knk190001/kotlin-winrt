package Windows.Media.Playback

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
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
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IPlaybackMediaMarkerSequence.ABI::class)
@Guid("f2810cee638b46cf88171d111fe9d8c4")
@WinRTByReference(IPlaybackMediaMarkerSequence.ByReference::class)
@TypeHash("__229105419_Type")
public interface IPlaybackMediaMarkerSequence : NativeMapped, IWinRTInterface,
    IIterable<PlaybackMediaMarker?> {
  public val __229105419_Ptr: Pointer?

  public val _229105419_VtblPtr: Pointer?
    get() = __229105419_Ptr?.getPointer(0)

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,PlaybackMediaMarker::class.createType()),
    ))

  public fun get_Size(): WinDef.UINT

  public fun Insert(value: PlaybackMediaMarker?): Unit

  public fun Clear(): Unit

  public interface WithDefault : IPlaybackMediaMarkerSequence {
    public override fun get_Size(): WinDef.UINT {
      val fnPtr = _229105419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__229105419_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = WinDef.UINT::class.createType()
      return marshalFromNative<WinDef.UINT>(result.getValue(), returnType!!)!!
    }

    public override fun Insert(value: PlaybackMediaMarker?): Unit {
      val fnPtr = _229105419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__229105419_Ptr,marshalToNative(value)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun Clear(): Unit {
      val fnPtr = _229105419_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__229105419_Ptr,))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackMediaMarkerSequence> {
    public override fun getValue(): IPlaybackMediaMarkerSequence =
        ABI.makeIPlaybackMediaMarkerSequence(pointer.getPointer(0))

    public fun setValue(value: IPlaybackMediaMarkerSequence): Unit {
      pointer = value.__229105419_Ptr!!
    }
  }

  public class IPlaybackMediaMarkerSequenceImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __229105419_Ptr: JNAPointer?
      get() = pointer

    public override val _229105419_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<PlaybackMediaMarker?>>())
      val result = PointerByReference()
      IUnknownVtbl(_229105419_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IPlaybackMediaMarkerSequence =
          IPlaybackMediaMarkerSequenceImpl(ptr)
    }
  }

  public object ABI : IABI<IPlaybackMediaMarkerSequence, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackMediaMarkerSequence(ptr: JNAPointer?) =
        IPlaybackMediaMarkerSequenceImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaybackMediaMarkerSequence {
      val address = segment.toRawLongValue()
      return makeIPlaybackMediaMarkerSequence(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackMediaMarkerSequence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__229105419_Ptr))
  }
}
