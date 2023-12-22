package Windows.Graphics.Printing

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

@ABIMarker(IStandardPrintTaskOptionsStatic2.ABI::class)
@Signature("{3be38bf4-7a44-4269-9a52-81261e289ee9}")
@Guid("3be38bf47a4442699a5281261e289ee9")
@WinRTInterface("3be38bf47a4442699a5281261e289ee9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardPrintTaskOptionsStatic2.ByReference::class)
public interface IStandardPrintTaskOptionsStatic2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bordering(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardPrintTaskOptionsStatic2> {
    public override fun getValue() = ABI.makeIStandardPrintTaskOptionsStatic2(pointer.getPointer(0))

    public fun setValue(value: IStandardPrintTaskOptionsStatic2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardPrintTaskOptionsStatic2 {
    public val __493834305_Ptr: Pointer?

    public val _493834305_VtblPtr: Pointer?
      get() = __493834305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bordering(): String? {
      val fnPtr = _493834305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__493834305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStandardPrintTaskOptionsStatic2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493834305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardPrintTaskOptionsStatic2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3be38bf47a4442699a5281261e289ee9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardPrintTaskOptionsStatic2(ptr: Pointer?): WithDefault =
        IStandardPrintTaskOptionsStatic2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardPrintTaskOptionsStatic2 {
      val address = segment.toRawLongValue()
      return makeIStandardPrintTaskOptionsStatic2(Pointer(address))
    }

    public override fun toNative(obj: IStandardPrintTaskOptionsStatic2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493834305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardPrintTaskOptionsStatic2):
        Array<IStandardPrintTaskOptionsStatic2?> = (elements as
        Array<IStandardPrintTaskOptionsStatic2?>).castToImpl<IStandardPrintTaskOptionsStatic2,IStandardPrintTaskOptionsStatic2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardPrintTaskOptionsStatic2?> =
        arrayOfNulls<IStandardPrintTaskOptionsStatic2_Impl>(size) as
        Array<IStandardPrintTaskOptionsStatic2?>
  }
}
