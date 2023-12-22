package Windows.Globalization

import Windows.Foundation.Collections.IVectorView
import Windows.System.User
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

@ABIMarker(IApplicationLanguagesStatics2.ABI::class)
@Signature("{1df0de4f-072b-4d7b-8f06-cb2db40f2bb5}")
@Guid("1df0de4f072b4d7b8f06cb2db40f2bb5")
@WinRTInterface("1df0de4f072b4d7b8f06cb2db40f2bb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationLanguagesStatics2.ByReference::class)
public interface IApplicationLanguagesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLanguagesForUser(user: User?): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationLanguagesStatics2> {
    public override fun getValue() = ABI.makeIApplicationLanguagesStatics2(pointer.getPointer(0))

    public fun setValue(value: IApplicationLanguagesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationLanguagesStatics2 {
    public val __260319371_Ptr: Pointer?

    public val _260319371_VtblPtr: Pointer?
      get() = __260319371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLanguagesForUser(user: User?): IVectorView<String?>? {
      val fnPtr = _260319371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__260319371_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationLanguagesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __260319371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationLanguagesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1df0de4f072b4d7b8f06cb2db40f2bb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationLanguagesStatics2(ptr: Pointer?): WithDefault =
        IApplicationLanguagesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationLanguagesStatics2 {
      val address = segment.toRawLongValue()
      return makeIApplicationLanguagesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationLanguagesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__260319371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationLanguagesStatics2):
        Array<IApplicationLanguagesStatics2?> = (elements as
        Array<IApplicationLanguagesStatics2?>).castToImpl<IApplicationLanguagesStatics2,IApplicationLanguagesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationLanguagesStatics2?> =
        arrayOfNulls<IApplicationLanguagesStatics2_Impl>(size) as
        Array<IApplicationLanguagesStatics2?>
  }
}
