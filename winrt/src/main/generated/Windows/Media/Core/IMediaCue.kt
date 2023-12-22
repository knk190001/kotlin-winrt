package Windows.Media.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(IMediaCue.ABI::class)
@Signature("{c7d15e5d-59dc-431f-a0ee-27744323b36d}")
@Guid("c7d15e5d59dc431fa0ee27744323b36d")
@WinRTInterface("c7d15e5d59dc431fa0ee27744323b36d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCue.ByReference::class)
public interface IMediaCue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_StartTime(value: TimeSpan?): Unit

  @InterfaceMethod(1)
  public fun get_StartTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(4)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Id(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCue> {
    public override fun getValue() = ABI.makeIMediaCue(pointer.getPointer(0))

    public fun setValue(value: IMediaCue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCue {
    public val __256643460_Ptr: Pointer?

    public val _256643460_VtblPtr: Pointer?
      get() = __256643460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_StartTime(value: TimeSpan?): Unit {
      val fnPtr = _256643460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_StartTime(): TimeSpan? {
      val fnPtr = _256643460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _256643460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _256643460_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _256643460_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Id(): String? {
      val fnPtr = _256643460_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__256643460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __256643460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7d15e5d59dc431fa0ee27744323b36d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCue(ptr: Pointer?): WithDefault = IMediaCue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCue {
      val address = segment.toRawLongValue()
      return makeIMediaCue(Pointer(address))
    }

    public override fun toNative(obj: IMediaCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__256643460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCue): Array<IMediaCue?> = (elements as
        Array<IMediaCue?>).castToImpl<IMediaCue,IMediaCue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCue?> = arrayOfNulls<IMediaCue_Impl>(size)
        as Array<IMediaCue?>
  }
}
