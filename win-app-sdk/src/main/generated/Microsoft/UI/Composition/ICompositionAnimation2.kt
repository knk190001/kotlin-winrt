package Microsoft.UI.Composition

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

@ABIMarker(ICompositionAnimation2.ABI::class)
@Signature("{0926eb58-8965-5c74-bdac-852ebb5e8542}")
@Guid("0926eb5889655c74bdac852ebb5e8542")
@WinRTInterface("0926eb5889655c74bdac852ebb5e8542")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimation2.ByReference::class)
public interface ICompositionAnimation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetBooleanParameter(key: String?, value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Target(): String?

  @InterfaceMethod(2)
  public fun put_Target(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimation2> {
    public override fun getValue() = ABI.makeICompositionAnimation2(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimation2 {
    public val __1238376447_Ptr: Pointer?

    public val _1238376447_VtblPtr: Pointer?
      get() = __1238376447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetBooleanParameter(key: String?, value: Boolean): Unit {
      val fnPtr = _1238376447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238376447_Ptr, marshalToNative(key), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Target(): String? {
      val fnPtr = _1238376447_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1238376447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Target(value: String?): Unit {
      val fnPtr = _1238376447_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238376447_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionAnimation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1238376447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0926eb5889655c74bdac852ebb5e8542")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimation2(ptr: Pointer?): WithDefault =
        ICompositionAnimation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimation2 {
      val address = segment.toRawLongValue()
      return makeICompositionAnimation2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1238376447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimation2): Array<ICompositionAnimation2?> =
        (elements as
        Array<ICompositionAnimation2?>).castToImpl<ICompositionAnimation2,ICompositionAnimation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimation2?> =
        arrayOfNulls<ICompositionAnimation2_Impl>(size) as Array<ICompositionAnimation2?>
  }
}
