package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IKeyAlgorithmNamesStatics2.ABI::class)
@Signature("{c99b5686-e1fd-4a4a-893d-a26f33dd8bb4}")
@Guid("c99b5686e1fd4a4a893da26f33dd8bb4")
@WinRTInterface("c99b5686e1fd4a4a893da26f33dd8bb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyAlgorithmNamesStatics2.ByReference::class)
public interface IKeyAlgorithmNamesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ecdsa(): String?

  @InterfaceMethod(1)
  public fun get_Ecdh(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyAlgorithmNamesStatics2> {
    public override fun getValue() = ABI.makeIKeyAlgorithmNamesStatics2(pointer.getPointer(0))

    public fun setValue(value: IKeyAlgorithmNamesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyAlgorithmNamesStatics2 {
    public val __1486351191_Ptr: Pointer?

    public val _1486351191_VtblPtr: Pointer?
      get() = __1486351191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ecdsa(): String? {
      val fnPtr = _1486351191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1486351191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Ecdh(): String? {
      val fnPtr = _1486351191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1486351191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyAlgorithmNamesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1486351191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyAlgorithmNamesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c99b5686e1fd4a4a893da26f33dd8bb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyAlgorithmNamesStatics2(ptr: Pointer?): WithDefault =
        IKeyAlgorithmNamesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyAlgorithmNamesStatics2 {
      val address = segment.toRawLongValue()
      return makeIKeyAlgorithmNamesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKeyAlgorithmNamesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486351191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyAlgorithmNamesStatics2):
        Array<IKeyAlgorithmNamesStatics2?> = (elements as
        Array<IKeyAlgorithmNamesStatics2?>).castToImpl<IKeyAlgorithmNamesStatics2,IKeyAlgorithmNamesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyAlgorithmNamesStatics2?> =
        arrayOfNulls<IKeyAlgorithmNamesStatics2_Impl>(size) as Array<IKeyAlgorithmNamesStatics2?>
  }
}
