package Windows.Web.Syndication

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

@ABIMarker(ISyndicationErrorStatics.ABI::class)
@Signature("{1fbb2361-45c7-4833-8aa0-be5f3b58a7f4}")
@Guid("1fbb236145c748338aa0be5f3b58a7f4")
@WinRTInterface("1fbb236145c748338aa0be5f3b58a7f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationErrorStatics.ByReference::class)
public interface ISyndicationErrorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(hresult: Int): SyndicationErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationErrorStatics> {
    public override fun getValue() = ABI.makeISyndicationErrorStatics(pointer.getPointer(0))

    public fun setValue(value: ISyndicationErrorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationErrorStatics {
    public val __267857997_Ptr: Pointer?

    public val _267857997_VtblPtr: Pointer?
      get() = __267857997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(hresult: Int): SyndicationErrorStatus? {
      val fnPtr = _267857997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__267857997_Ptr, hresult, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationErrorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __267857997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationErrorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1fbb236145c748338aa0be5f3b58a7f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationErrorStatics(ptr: Pointer?): WithDefault =
        ISyndicationErrorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationErrorStatics {
      val address = segment.toRawLongValue()
      return makeISyndicationErrorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationErrorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__267857997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationErrorStatics):
        Array<ISyndicationErrorStatics?> = (elements as
        Array<ISyndicationErrorStatics?>).castToImpl<ISyndicationErrorStatics,ISyndicationErrorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationErrorStatics?> =
        arrayOfNulls<ISyndicationErrorStatics_Impl>(size) as Array<ISyndicationErrorStatics?>
  }
}
