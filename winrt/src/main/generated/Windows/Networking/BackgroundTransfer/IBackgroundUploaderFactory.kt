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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundUploaderFactory.ABI::class)
@Signature("{736203c7-10e7-48a0-ac3c-1ac71095ec57}")
@Guid("736203c710e748a0ac3c1ac71095ec57")
@WinRTInterface("736203c710e748a0ac3c1ac71095ec57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploaderFactory.ByReference::class)
public interface IBackgroundUploaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithCompletionGroup(completionGroup: BackgroundTransferCompletionGroup?):
      BackgroundUploader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploaderFactory> {
    public override fun getValue() = ABI.makeIBackgroundUploaderFactory(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploaderFactory {
    public val __1511281549_Ptr: Pointer?

    public val _1511281549_VtblPtr: Pointer?
      get() = __1511281549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateWithCompletionGroup(completionGroup: BackgroundTransferCompletionGroup?):
        BackgroundUploader? {
      val fnPtr = _1511281549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundUploader>()
      val hr = fn.invokeHR(arrayOf(__1511281549_Ptr, marshalToNative(completionGroup), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundUploader>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundUploaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1511281549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("736203c710e748a0ac3c1ac71095ec57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploaderFactory(ptr: Pointer?): WithDefault =
        IBackgroundUploaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploaderFactory {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploaderFactory(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1511281549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploaderFactory):
        Array<IBackgroundUploaderFactory?> = (elements as
        Array<IBackgroundUploaderFactory?>).castToImpl<IBackgroundUploaderFactory,IBackgroundUploaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploaderFactory?> =
        arrayOfNulls<IBackgroundUploaderFactory_Impl>(size) as Array<IBackgroundUploaderFactory?>
  }
}
