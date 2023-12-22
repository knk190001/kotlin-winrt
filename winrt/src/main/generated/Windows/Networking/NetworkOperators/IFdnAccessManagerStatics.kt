package Windows.Networking.NetworkOperators

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFdnAccessManagerStatics.ABI::class)
@Signature("{f2aa4395-f1e6-4319-aa3e-477ca64b2bdf}")
@Guid("f2aa4395f1e64319aa3e477ca64b2bdf")
@WinRTInterface("f2aa4395f1e64319aa3e477ca64b2bdf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFdnAccessManagerStatics.ByReference::class)
public interface IFdnAccessManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestUnlockAsync(contactListId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFdnAccessManagerStatics> {
    public override fun getValue() = ABI.makeIFdnAccessManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IFdnAccessManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFdnAccessManagerStatics {
    public val __347288749_Ptr: Pointer?

    public val _347288749_VtblPtr: Pointer?
      get() = __347288749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestUnlockAsync(contactListId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _347288749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__347288749_Ptr, marshalToNative(contactListId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IFdnAccessManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __347288749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFdnAccessManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2aa4395f1e64319aa3e477ca64b2bdf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFdnAccessManagerStatics(ptr: Pointer?): WithDefault =
        IFdnAccessManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFdnAccessManagerStatics {
      val address = segment.toRawLongValue()
      return makeIFdnAccessManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFdnAccessManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__347288749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFdnAccessManagerStatics):
        Array<IFdnAccessManagerStatics?> = (elements as
        Array<IFdnAccessManagerStatics?>).castToImpl<IFdnAccessManagerStatics,IFdnAccessManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFdnAccessManagerStatics?> =
        arrayOfNulls<IFdnAccessManagerStatics_Impl>(size) as Array<IFdnAccessManagerStatics?>
  }
}
