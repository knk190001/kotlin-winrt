package Windows.Media.ContentRestrictions

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

@ABIMarker(IRatedContentRestrictionsFactory.ABI::class)
@Signature("{fb4b2996-c3bd-4910-9619-97cfd0694d56}")
@Guid("fb4b2996c3bd4910961997cfd0694d56")
@WinRTInterface("fb4b2996c3bd4910961997cfd0694d56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatedContentRestrictionsFactory.ByReference::class)
public interface IRatedContentRestrictionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithMaxAgeRating(maxAgeRating: WinDef.UINT): RatedContentRestrictions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatedContentRestrictionsFactory> {
    public override fun getValue() = ABI.makeIRatedContentRestrictionsFactory(pointer.getPointer(0))

    public fun setValue(value: IRatedContentRestrictionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatedContentRestrictionsFactory {
    public val __788997904_Ptr: Pointer?

    public val _788997904_VtblPtr: Pointer?
      get() = __788997904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithMaxAgeRating(maxAgeRating: WinDef.UINT):
        RatedContentRestrictions? {
      val fnPtr = _788997904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatedContentRestrictions>()
      val hr = fn.invokeHR(arrayOf(__788997904_Ptr, maxAgeRating, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatedContentRestrictions>(result.getValue())
      return resultValue
    }
  }

  public class IRatedContentRestrictionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788997904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatedContentRestrictionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb4b2996c3bd4910961997cfd0694d56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatedContentRestrictionsFactory(ptr: Pointer?): WithDefault =
        IRatedContentRestrictionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatedContentRestrictionsFactory {
      val address = segment.toRawLongValue()
      return makeIRatedContentRestrictionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IRatedContentRestrictionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788997904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatedContentRestrictionsFactory):
        Array<IRatedContentRestrictionsFactory?> = (elements as
        Array<IRatedContentRestrictionsFactory?>).castToImpl<IRatedContentRestrictionsFactory,IRatedContentRestrictionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatedContentRestrictionsFactory?> =
        arrayOfNulls<IRatedContentRestrictionsFactory_Impl>(size) as
        Array<IRatedContentRestrictionsFactory?>
  }
}
