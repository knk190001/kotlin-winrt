package Windows.Media.Core

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

@ABIMarker(IMediaTrack.ABI::class)
@Signature("{03e1fafc-c931-491a-b46b-c10ee8c256b7}")
@Guid("03e1fafcc931491ab46bc10ee8c256b7")
@WinRTInterface("03e1fafcc931491ab46bc10ee8c256b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTrack.ByReference::class)
public interface IMediaTrack : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_TrackKind(): MediaTrackKind?

  @InterfaceMethod(3)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Label(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaTrack> {
    public override fun getValue() = ABI.makeIMediaTrack(pointer.getPointer(0))

    public fun setValue(value: IMediaTrack_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTrack {
    public val __1836839004_Ptr: Pointer?

    public val _1836839004_VtblPtr: Pointer?
      get() = __1836839004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1836839004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1836839004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _1836839004_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1836839004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TrackKind(): MediaTrackKind? {
      val fnPtr = _1836839004_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTrackKind>()
      val hr = fn.invokeHR(arrayOf(__1836839004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTrackKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1836839004_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1836839004_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Label(): String? {
      val fnPtr = _1836839004_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1836839004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTrack_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1836839004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTrack, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e1fafcc931491ab46bc10ee8c256b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTrack(ptr: Pointer?): WithDefault = IMediaTrack_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTrack {
      val address = segment.toRawLongValue()
      return makeIMediaTrack(Pointer(address))
    }

    public override fun toNative(obj: IMediaTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1836839004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTrack): Array<IMediaTrack?> = (elements as
        Array<IMediaTrack?>).castToImpl<IMediaTrack,IMediaTrack_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTrack?> =
        arrayOfNulls<IMediaTrack_Impl>(size) as Array<IMediaTrack?>
  }
}
