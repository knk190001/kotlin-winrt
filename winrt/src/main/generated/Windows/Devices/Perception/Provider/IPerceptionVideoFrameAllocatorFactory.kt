package Windows.Devices.Perception.Provider

import Windows.Foundation.Size
import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPerceptionVideoFrameAllocatorFactory.ABI::class)
@Signature("{1a58b0e1-e91a-481e-b876-a89e2bbc6b33}")
@Guid("1a58b0e1e91a481eb876a89e2bbc6b33")
@WinRTInterface("1a58b0e1e91a481eb876a89e2bbc6b33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionVideoFrameAllocatorFactory.ByReference::class)
public interface IPerceptionVideoFrameAllocatorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    maxOutstandingFrameCountForWrite: WinDef.UINT,
    format: BitmapPixelFormat?,
    resolution: Size?,
    alpha: BitmapAlphaMode?
  ): PerceptionVideoFrameAllocator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionVideoFrameAllocatorFactory> {
    public override fun getValue() =
        ABI.makeIPerceptionVideoFrameAllocatorFactory(pointer.getPointer(0))

    public fun setValue(value: IPerceptionVideoFrameAllocatorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionVideoFrameAllocatorFactory {
    public val __1807664161_Ptr: Pointer?

    public val _1807664161_VtblPtr: Pointer?
      get() = __1807664161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      maxOutstandingFrameCountForWrite: WinDef.UINT,
      format: BitmapPixelFormat?,
      resolution: Size?,
      alpha: BitmapAlphaMode?
    ): PerceptionVideoFrameAllocator? {
      val fnPtr = _1807664161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionVideoFrameAllocator>()
      val hr = fn.invokeHR(arrayOf(__1807664161_Ptr, maxOutstandingFrameCountForWrite,
          marshalToNative(format), marshalToNative(resolution), marshalToNative(alpha), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionVideoFrameAllocator>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionVideoFrameAllocatorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1807664161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionVideoFrameAllocatorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a58b0e1e91a481eb876a89e2bbc6b33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionVideoFrameAllocatorFactory(ptr: Pointer?): WithDefault =
        IPerceptionVideoFrameAllocatorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionVideoFrameAllocatorFactory {
      val address = segment.toRawLongValue()
      return makeIPerceptionVideoFrameAllocatorFactory(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionVideoFrameAllocatorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1807664161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionVideoFrameAllocatorFactory):
        Array<IPerceptionVideoFrameAllocatorFactory?> = (elements as
        Array<IPerceptionVideoFrameAllocatorFactory?>).castToImpl<IPerceptionVideoFrameAllocatorFactory,IPerceptionVideoFrameAllocatorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionVideoFrameAllocatorFactory?> =
        arrayOfNulls<IPerceptionVideoFrameAllocatorFactory_Impl>(size) as
        Array<IPerceptionVideoFrameAllocatorFactory?>
  }
}
