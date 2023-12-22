package Windows.Networking.BackgroundTransfer

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

@ABIMarker(IBackgroundTransferContentPartFactory.ABI::class)
@Signature("{90ef98a9-7a01-4a0b-9f80-a0b0bb370f8d}")
@Guid("90ef98a97a014a0b9f80a0b0bb370f8d")
@WinRTInterface("90ef98a97a014a0b9f80a0b0bb370f8d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferContentPartFactory.ByReference::class)
public interface IBackgroundTransferContentPartFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithName(name: String?): BackgroundTransferContentPart?

  @InterfaceMethod(1)
  public fun CreateWithNameAndFileName(name: String?, fileName: String?):
      BackgroundTransferContentPart?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferContentPartFactory> {
    public override fun getValue() =
        ABI.makeIBackgroundTransferContentPartFactory(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferContentPartFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferContentPartFactory {
    public val __156994872_Ptr: Pointer?

    public val _156994872_VtblPtr: Pointer?
      get() = __156994872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithName(name: String?): BackgroundTransferContentPart? {
      val fnPtr = _156994872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferContentPart>()
      val hr = fn.invokeHR(arrayOf(__156994872_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferContentPart>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithNameAndFileName(name: String?, fileName: String?):
        BackgroundTransferContentPart? {
      val fnPtr = _156994872_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferContentPart>()
      val hr = fn.invokeHR(arrayOf(__156994872_Ptr, marshalToNative(name),
          marshalToNative(fileName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferContentPart>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTransferContentPartFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156994872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferContentPartFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90ef98a97a014a0b9f80a0b0bb370f8d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferContentPartFactory(ptr: Pointer?): WithDefault =
        IBackgroundTransferContentPartFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferContentPartFactory {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferContentPartFactory(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferContentPartFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156994872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferContentPartFactory):
        Array<IBackgroundTransferContentPartFactory?> = (elements as
        Array<IBackgroundTransferContentPartFactory?>).castToImpl<IBackgroundTransferContentPartFactory,IBackgroundTransferContentPartFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferContentPartFactory?> =
        arrayOfNulls<IBackgroundTransferContentPartFactory_Impl>(size) as
        Array<IBackgroundTransferContentPartFactory?>
  }
}
