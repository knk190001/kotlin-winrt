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

@ABIMarker(IKeyDerivationParametersStatics.ABI::class)
@Signature("{ea961fbe-f37f-4146-9dfe-a456f1735f4b}")
@Guid("ea961fbef37f41469dfea456f1735f4b")
@WinRTInterface("ea961fbef37f41469dfea456f1735f4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationParametersStatics.ByReference::class)
public interface IKeyDerivationParametersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BuildForPbkdf2(pbkdf2Salt: IBuffer?, iterationCount: WinDef.UINT):
      KeyDerivationParameters?

  @InterfaceMethod(1)
  public fun BuildForSP800108(label: IBuffer?, context: IBuffer?): KeyDerivationParameters?

  @InterfaceMethod(2)
  public fun BuildForSP80056a(
    algorithmId: IBuffer?,
    partyUInfo: IBuffer?,
    partyVInfo: IBuffer?,
    suppPubInfo: IBuffer?,
    suppPrivInfo: IBuffer?
  ): KeyDerivationParameters?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationParametersStatics> {
    public override fun getValue() = ABI.makeIKeyDerivationParametersStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationParametersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationParametersStatics {
    public val __1832924976_Ptr: Pointer?

    public val _1832924976_VtblPtr: Pointer?
      get() = __1832924976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BuildForPbkdf2(pbkdf2Salt: IBuffer?, iterationCount: WinDef.UINT):
        KeyDerivationParameters? {
      val fnPtr = _1832924976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyDerivationParameters>()
      val hr = fn.invokeHR(arrayOf(__1832924976_Ptr, marshalToNative(pbkdf2Salt), iterationCount,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyDerivationParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun BuildForSP800108(label: IBuffer?, context: IBuffer?):
        KeyDerivationParameters? {
      val fnPtr = _1832924976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyDerivationParameters>()
      val hr = fn.invokeHR(arrayOf(__1832924976_Ptr, marshalToNative(label),
          marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyDerivationParameters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun BuildForSP80056a(
      algorithmId: IBuffer?,
      partyUInfo: IBuffer?,
      partyVInfo: IBuffer?,
      suppPubInfo: IBuffer?,
      suppPrivInfo: IBuffer?
    ): KeyDerivationParameters? {
      val fnPtr = _1832924976_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyDerivationParameters>()
      val hr = fn.invokeHR(arrayOf(__1832924976_Ptr, marshalToNative(algorithmId),
          marshalToNative(partyUInfo), marshalToNative(partyVInfo), marshalToNative(suppPubInfo),
          marshalToNative(suppPrivInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyDerivationParameters>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationParametersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1832924976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationParametersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea961fbef37f41469dfea456f1735f4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationParametersStatics(ptr: Pointer?): WithDefault =
        IKeyDerivationParametersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationParametersStatics {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationParametersStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationParametersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1832924976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationParametersStatics):
        Array<IKeyDerivationParametersStatics?> = (elements as
        Array<IKeyDerivationParametersStatics?>).castToImpl<IKeyDerivationParametersStatics,IKeyDerivationParametersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationParametersStatics?> =
        arrayOfNulls<IKeyDerivationParametersStatics_Impl>(size) as
        Array<IKeyDerivationParametersStatics?>
  }
}
