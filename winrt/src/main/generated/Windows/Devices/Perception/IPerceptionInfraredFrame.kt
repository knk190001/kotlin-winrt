package Windows.Devices.Perception

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Media.VideoFrame
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

@ABIMarker(IPerceptionInfraredFrame.ABI::class)
@Signature("{b0886276-849e-4c7a-8ae6-b56064532153}")
@Guid("b0886276849e4c7a8ae6b56064532153")
@WinRTInterface("b0886276849e4c7a8ae6b56064532153")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrame.ByReference::class)
public interface IPerceptionInfraredFrame : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_VideoFrame(): VideoFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrame> {
    public override fun getValue() = ABI.makeIPerceptionInfraredFrame(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrame, IClosable.WithDefault {
    public val __642554113_Ptr: Pointer?

    public val _642554113_VtblPtr: Pointer?
      get() = __642554113_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoFrame(): VideoFrame? {
      val fnPtr = _642554113_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__642554113_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_642554113_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __642554113_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0886276849e4c7a8ae6b56064532153")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrame(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionInfraredFrame {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrame(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__642554113_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrame):
        Array<IPerceptionInfraredFrame?> = (elements as
        Array<IPerceptionInfraredFrame?>).castToImpl<IPerceptionInfraredFrame,IPerceptionInfraredFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrame?> =
        arrayOfNulls<IPerceptionInfraredFrame_Impl>(size) as Array<IPerceptionInfraredFrame?>
  }
}
