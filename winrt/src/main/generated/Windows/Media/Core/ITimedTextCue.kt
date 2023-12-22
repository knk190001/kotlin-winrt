package Windows.Media.Core

import Windows.Foundation.Collections.IVector
import Windows.Media.Core.IMediaCue.ABI.IID
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

@ABIMarker(ITimedTextCue.ABI::class)
@Signature("{51c79e51-3b86-494d-b359-bb2ea7aca9a9}")
@Guid("51c79e513b86494db359bb2ea7aca9a9")
@WinRTInterface("51c79e513b86494db359bb2ea7aca9a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextCue.ByReference::class)
public interface ITimedTextCue : NativeMapped, IWinRTInterface, IMediaCue {
  @InterfaceMethod(0)
  public fun get_CueRegion(): TimedTextRegion?

  @InterfaceMethod(1)
  public fun put_CueRegion(value: TimedTextRegion?): Unit

  @InterfaceMethod(2)
  public fun get_CueStyle(): TimedTextStyle?

  @InterfaceMethod(3)
  public fun put_CueStyle(value: TimedTextStyle?): Unit

  @InterfaceMethod(4)
  public fun get_Lines(): IVector<TimedTextLine?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimedTextCue>
      {
    public override fun getValue() = ABI.makeITimedTextCue(pointer.getPointer(0))

    public fun setValue(value: ITimedTextCue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextCue, IMediaCue.WithDefault {
    public val __269308444_Ptr: Pointer?

    public val _269308444_VtblPtr: Pointer?
      get() = __269308444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CueRegion(): TimedTextRegion? {
      val fnPtr = _269308444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextRegion>()
      val hr = fn.invokeHR(arrayOf(__269308444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextRegion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CueRegion(value: TimedTextRegion?): Unit {
      val fnPtr = _269308444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__269308444_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CueStyle(): TimedTextStyle? {
      val fnPtr = _269308444_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedTextStyle>()
      val hr = fn.invokeHR(arrayOf(__269308444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedTextStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CueStyle(value: TimedTextStyle?): Unit {
      val fnPtr = _269308444_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__269308444_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Lines(): IVector<TimedTextLine?>? {
      val fnPtr = _269308444_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TimedTextLine?>>()
      val hr = fn.invokeHR(arrayOf(__269308444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TimedTextLine?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimedTextCue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaCue {
    public override val __256643460_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_269308444_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __269308444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextCue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51c79e513b86494db359bb2ea7aca9a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextCue(ptr: Pointer?): WithDefault = ITimedTextCue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextCue {
      val address = segment.toRawLongValue()
      return makeITimedTextCue(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__269308444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextCue): Array<ITimedTextCue?> = (elements as
        Array<ITimedTextCue?>).castToImpl<ITimedTextCue,ITimedTextCue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextCue?> =
        arrayOfNulls<ITimedTextCue_Impl>(size) as Array<ITimedTextCue?>
  }
}
