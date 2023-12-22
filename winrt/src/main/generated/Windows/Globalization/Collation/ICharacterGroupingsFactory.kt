package Windows.Globalization.Collation

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

@ABIMarker(ICharacterGroupingsFactory.ABI::class)
@Signature("{99ea9fd9-886d-4401-9f98-69c82d4c2f78}")
@Guid("99ea9fd9886d44019f9869c82d4c2f78")
@WinRTInterface("99ea9fd9886d44019f9869c82d4c2f78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICharacterGroupingsFactory.ByReference::class)
public interface ICharacterGroupingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(language: String?): CharacterGroupings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterGroupingsFactory> {
    public override fun getValue() = ABI.makeICharacterGroupingsFactory(pointer.getPointer(0))

    public fun setValue(value: ICharacterGroupingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICharacterGroupingsFactory {
    public val __320059573_Ptr: Pointer?

    public val _320059573_VtblPtr: Pointer?
      get() = __320059573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(language: String?): CharacterGroupings? {
      val fnPtr = _320059573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CharacterGroupings>()
      val hr = fn.invokeHR(arrayOf(__320059573_Ptr, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CharacterGroupings>(result.getValue())
      return resultValue
    }
  }

  public class ICharacterGroupingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __320059573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICharacterGroupingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99ea9fd9886d44019f9869c82d4c2f78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterGroupingsFactory(ptr: Pointer?): WithDefault =
        ICharacterGroupingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterGroupingsFactory {
      val address = segment.toRawLongValue()
      return makeICharacterGroupingsFactory(Pointer(address))
    }

    public override fun toNative(obj: ICharacterGroupingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__320059573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICharacterGroupingsFactory):
        Array<ICharacterGroupingsFactory?> = (elements as
        Array<ICharacterGroupingsFactory?>).castToImpl<ICharacterGroupingsFactory,ICharacterGroupingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICharacterGroupingsFactory?> =
        arrayOfNulls<ICharacterGroupingsFactory_Impl>(size) as Array<ICharacterGroupingsFactory?>
  }
}
