package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IMacAlgorithmProvider2.ABI::class)
@Signature("{6da32a15-d931-42ed-8e7e-c301caee119c}")
@Guid("6da32a15d93142ed8e7ec301caee119c")
@WinRTInterface("6da32a15d93142ed8e7ec301caee119c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMacAlgorithmProvider2.ByReference::class)
public interface IMacAlgorithmProvider2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateHash(keyMaterial: IBuffer?): CryptographicHash?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMacAlgorithmProvider2> {
    public override fun getValue() = ABI.makeIMacAlgorithmProvider2(pointer.getPointer(0))

    public fun setValue(value: IMacAlgorithmProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMacAlgorithmProvider2 {
    public val __97014742_Ptr: Pointer?

    public val _97014742_VtblPtr: Pointer?
      get() = __97014742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateHash(keyMaterial: IBuffer?): CryptographicHash? {
      val fnPtr = _97014742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicHash>()
      val hr = fn.invokeHR(arrayOf(__97014742_Ptr, marshalToNative(keyMaterial), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicHash>(result.getValue())
      return resultValue
    }
  }

  public class IMacAlgorithmProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97014742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMacAlgorithmProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6da32a15d93142ed8e7ec301caee119c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMacAlgorithmProvider2(ptr: Pointer?): WithDefault =
        IMacAlgorithmProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMacAlgorithmProvider2 {
      val address = segment.toRawLongValue()
      return makeIMacAlgorithmProvider2(Pointer(address))
    }

    public override fun toNative(obj: IMacAlgorithmProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97014742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMacAlgorithmProvider2): Array<IMacAlgorithmProvider2?> =
        (elements as
        Array<IMacAlgorithmProvider2?>).castToImpl<IMacAlgorithmProvider2,IMacAlgorithmProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMacAlgorithmProvider2?> =
        arrayOfNulls<IMacAlgorithmProvider2_Impl>(size) as Array<IMacAlgorithmProvider2?>
  }
}
