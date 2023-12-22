package Windows.Devices.Perception.Provider

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

@ABIMarker(IPerceptionVideoFrameAllocator.ABI::class)
@Signature("{4c38a7da-fdd8-4ed4-a039-2a6f9b235038}")
@Guid("4c38a7dafdd84ed4a0392a6f9b235038")
@WinRTInterface("4c38a7dafdd84ed4a0392a6f9b235038")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionVideoFrameAllocator.ByReference::class)
public interface IPerceptionVideoFrameAllocator : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun AllocateFrame(): PerceptionFrame?

  @InterfaceMethod(1)
  public fun CopyFromVideoFrame(frame: VideoFrame?): PerceptionFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionVideoFrameAllocator> {
    public override fun getValue() = ABI.makeIPerceptionVideoFrameAllocator(pointer.getPointer(0))

    public fun setValue(value: IPerceptionVideoFrameAllocator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionVideoFrameAllocator, IClosable.WithDefault {
    public val __1812257623_Ptr: Pointer?

    public val _1812257623_VtblPtr: Pointer?
      get() = __1812257623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AllocateFrame(): PerceptionFrame? {
      val fnPtr = _1812257623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFrame>()
      val hr = fn.invokeHR(arrayOf(__1812257623_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyFromVideoFrame(frame: VideoFrame?): PerceptionFrame? {
      val fnPtr = _1812257623_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFrame>()
      val hr = fn.invokeHR(arrayOf(__1812257623_Ptr, marshalToNative(frame), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionVideoFrameAllocator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1812257623_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1812257623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionVideoFrameAllocator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c38a7dafdd84ed4a0392a6f9b235038")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionVideoFrameAllocator(ptr: Pointer?): WithDefault =
        IPerceptionVideoFrameAllocator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionVideoFrameAllocator {
      val address = segment.toRawLongValue()
      return makeIPerceptionVideoFrameAllocator(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionVideoFrameAllocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1812257623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionVideoFrameAllocator):
        Array<IPerceptionVideoFrameAllocator?> = (elements as
        Array<IPerceptionVideoFrameAllocator?>).castToImpl<IPerceptionVideoFrameAllocator,IPerceptionVideoFrameAllocator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionVideoFrameAllocator?> =
        arrayOfNulls<IPerceptionVideoFrameAllocator_Impl>(size) as
        Array<IPerceptionVideoFrameAllocator?>
  }
}
