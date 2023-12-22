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

@ABIMarker(IPerceptionInfraredFrameSourceStatics.ABI::class)
@Signature("{5df3cca2-01f8-4a87-b859-d5e5b7e1de47}")
@Guid("5df3cca201f84a87b859d5e5b7e1de47")
@WinRTInterface("5df3cca201f84a87b859d5e5b7e1de47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSourceStatics.ByReference::class)
public interface IPerceptionInfraredFrameSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcher(): PerceptionInfraredFrameSourceWatcher?

  @InterfaceMethod(1)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<PerceptionInfraredFrameSource?>?>?

  @InterfaceMethod(2)
  public fun FromIdAsync(id: String?): IAsyncOperation<PerceptionInfraredFrameSource?>?

  @InterfaceMethod(3)
  public fun RequestAccessAsync(): IAsyncOperation<PerceptionFrameSourceAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSourceStatics> {
    public override fun getValue() =
        ABI.makeIPerceptionInfraredFrameSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSourceStatics {
    public val __543405461_Ptr: Pointer?

    public val _543405461_VtblPtr: Pointer?
      get() = __543405461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcher(): PerceptionInfraredFrameSourceWatcher? {
      val fnPtr = _543405461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionInfraredFrameSourceWatcher>()
      val hr = fn.invokeHR(arrayOf(__543405461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionInfraredFrameSourceWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync():
        IAsyncOperation<IVectorView<PerceptionInfraredFrameSource?>?>? {
      val fnPtr = _543405461_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<PerceptionInfraredFrameSource?>?>>()
      val hr = fn.invokeHR(arrayOf(__543405461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PerceptionInfraredFrameSource?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(id: String?): IAsyncOperation<PerceptionInfraredFrameSource?>? {
      val fnPtr = _543405461_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PerceptionInfraredFrameSource?>>()
      val hr = fn.invokeHR(arrayOf(__543405461_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionInfraredFrameSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessAsync(): IAsyncOperation<PerceptionFrameSourceAccessStatus?>? {
      val fnPtr = _543405461_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PerceptionFrameSourceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__543405461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PerceptionFrameSourceAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __543405461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df3cca201f84a87b859d5e5b7e1de47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSourceStatics(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionInfraredFrameSourceStatics {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__543405461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSourceStatics):
        Array<IPerceptionInfraredFrameSourceStatics?> = (elements as
        Array<IPerceptionInfraredFrameSourceStatics?>).castToImpl<IPerceptionInfraredFrameSourceStatics,IPerceptionInfraredFrameSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSourceStatics?> =
        arrayOfNulls<IPerceptionInfraredFrameSourceStatics_Impl>(size) as
        Array<IPerceptionInfraredFrameSourceStatics?>
  }
}
