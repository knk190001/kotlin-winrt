package Windows.Media.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChapterCue.ABI::class)
@Signature("{72a98001-d38a-4c0a-8fa6-75cddaf4664c}")
@Guid("72a98001d38a4c0a8fa675cddaf4664c")
@WinRTInterface("72a98001d38a4c0a8fa675cddaf4664c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChapterCue.ByReference::class)
public interface IChapterCue : NativeMapped, IWinRTInterface, IMediaCue {
  @InterfaceMethod(0)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Title(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChapterCue> {
    public override fun getValue() = ABI.makeIChapterCue(pointer.getPointer(0))

    public fun setValue(value: IChapterCue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChapterCue, IMediaCue.WithDefault {
    public val __76669125_Ptr: Pointer?

    public val _76669125_VtblPtr: Pointer?
      get() = __76669125_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _76669125_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__76669125_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _76669125_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__76669125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IChapterCue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaCue {
    public override val __256643460_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_76669125_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __76669125_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChapterCue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72a98001d38a4c0a8fa675cddaf4664c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChapterCue(ptr: Pointer?): WithDefault = IChapterCue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChapterCue {
      val address = segment.toRawLongValue()
      return makeIChapterCue(Pointer(address))
    }

    public override fun toNative(obj: IChapterCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__76669125_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChapterCue): Array<IChapterCue?> = (elements as
        Array<IChapterCue?>).castToImpl<IChapterCue,IChapterCue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChapterCue?> =
        arrayOfNulls<IChapterCue_Impl>(size) as Array<IChapterCue?>
  }
}
