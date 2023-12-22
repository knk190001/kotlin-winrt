package Windows.Devices.Perception

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPerceptionColorFrameSourceStatics.ABI::class)
@Signature("{5df3cca2-01f8-4a87-b859-d5e5b7e1de49}")
@Guid("5df3cca201f84a87b859d5e5b7e1de49")
@WinRTInterface("5df3cca201f84a87b859d5e5b7e1de49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionColorFrameSourceStatics.ByReference::class)
public interface IPerceptionColorFrameSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcher(): PerceptionColorFrameSourceWatcher?

  @InterfaceMethod(1)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<PerceptionColorFrameSource?>?>?

  @InterfaceMethod(2)
  public fun FromIdAsync(id: String?): IAsyncOperation<PerceptionColorFrameSource?>?

  @InterfaceMethod(3)
  public fun RequestAccessAsync(): IAsyncOperation<PerceptionFrameSourceAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionColorFrameSourceStatics> {
    public override fun getValue() =
        ABI.makeIPerceptionColorFrameSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IPerceptionColorFrameSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionColorFrameSourceStatics {
    public val __1308838291_Ptr: Pointer?

    public val _1308838291_VtblPtr: Pointer?
      get() = __1308838291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcher(): PerceptionColorFrameSourceWatcher? {
      val fnPtr = _1308838291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionColorFrameSourceWatcher>()
      val hr = fn.invokeHR(arrayOf(__1308838291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionColorFrameSourceWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync():
        IAsyncOperation<IVectorView<PerceptionColorFrameSource?>?>? {
      val fnPtr = _1308838291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PerceptionColorFrameSource?>?>>()
      val hr = fn.invokeHR(arrayOf(__1308838291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PerceptionColorFrameSource?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(id: String?): IAsyncOperation<PerceptionColorFrameSource?>? {
      val fnPtr = _1308838291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PerceptionColorFrameSource?>>()
      val hr = fn.invokeHR(arrayOf(__1308838291_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionColorFrameSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessAsync(): IAsyncOperation<PerceptionFrameSourceAccessStatus?>? {
      val fnPtr = _1308838291_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PerceptionFrameSourceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1308838291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionFrameSourceAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionColorFrameSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1308838291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionColorFrameSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df3cca201f84a87b859d5e5b7e1de49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionColorFrameSourceStatics(ptr: Pointer?): WithDefault =
        IPerceptionColorFrameSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionColorFrameSourceStatics {
      val address = segment.toRawLongValue()
      return makeIPerceptionColorFrameSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionColorFrameSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1308838291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionColorFrameSourceStatics):
        Array<IPerceptionColorFrameSourceStatics?> = (elements as
        Array<IPerceptionColorFrameSourceStatics?>).castToImpl<IPerceptionColorFrameSourceStatics,IPerceptionColorFrameSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionColorFrameSourceStatics?> =
        arrayOfNulls<IPerceptionColorFrameSourceStatics_Impl>(size) as
        Array<IPerceptionColorFrameSourceStatics?>
  }
}
