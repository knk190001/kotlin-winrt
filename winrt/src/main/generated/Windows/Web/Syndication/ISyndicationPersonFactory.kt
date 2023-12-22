package Windows.Web.Syndication

import Windows.Foundation.Uri
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

@ABIMarker(ISyndicationPersonFactory.ABI::class)
@Signature("{dcf4886d-229d-4b58-a49b-f3d2f0f5c99f}")
@Guid("dcf4886d229d4b58a49bf3d2f0f5c99f")
@WinRTInterface("dcf4886d229d4b58a49bf3d2f0f5c99f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationPersonFactory.ByReference::class)
public interface ISyndicationPersonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationPerson(name: String?): SyndicationPerson?

  @InterfaceMethod(1)
  public fun CreateSyndicationPersonEx(
    name: String?,
    email: String?,
    uri: Uri?
  ): SyndicationPerson?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationPersonFactory> {
    public override fun getValue() = ABI.makeISyndicationPersonFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationPersonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationPersonFactory {
    public val __1364846149_Ptr: Pointer?

    public val _1364846149_VtblPtr: Pointer?
      get() = __1364846149_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationPerson(name: String?): SyndicationPerson? {
      val fnPtr = _1364846149_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationPerson>()
      val hr = fn.invokeHR(arrayOf(__1364846149_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationPerson>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSyndicationPersonEx(
      name: String?,
      email: String?,
      uri: Uri?
    ): SyndicationPerson? {
      val fnPtr = _1364846149_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationPerson>()
      val hr = fn.invokeHR(arrayOf(__1364846149_Ptr, marshalToNative(name), marshalToNative(email),
          marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationPerson>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationPersonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1364846149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationPersonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcf4886d229d4b58a49bf3d2f0f5c99f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationPersonFactory(ptr: Pointer?): WithDefault =
        ISyndicationPersonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationPersonFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationPersonFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationPersonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1364846149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationPersonFactory):
        Array<ISyndicationPersonFactory?> = (elements as
        Array<ISyndicationPersonFactory?>).castToImpl<ISyndicationPersonFactory,ISyndicationPersonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationPersonFactory?> =
        arrayOfNulls<ISyndicationPersonFactory_Impl>(size) as Array<ISyndicationPersonFactory?>
  }
}
