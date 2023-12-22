package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDCustomDataFactory.ABI::class)
@Signature("{d65405ab-3424-4833-8c9a-af5fdeb22872}")
@Guid("d65405ab342448338c9aaf5fdeb22872")
@WinRTInterface("d65405ab342448338c9aaf5fdeb22872")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDCustomDataFactory.ByReference::class)
public interface INDCustomDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(customDataTypeIDBytes: Array<Byte>, customDataBytes: Array<Byte>):
      NDCustomData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDCustomDataFactory> {
    public override fun getValue() = ABI.makeINDCustomDataFactory(pointer.getPointer(0))

    public fun setValue(value: INDCustomDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDCustomDataFactory {
    public val __1288259231_Ptr: Pointer?

    public val _1288259231_VtblPtr: Pointer?
      get() = __1288259231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(customDataTypeIDBytes: Array<Byte>,
        customDataBytes: Array<Byte>): NDCustomData? {
      val fnPtr = _1288259231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDCustomData>()
      val hr = fn.invokeHR(arrayOf(__1288259231_Ptr,
          customDataTypeIDBytes.size,marshalToNative(customDataTypeIDBytes),
          customDataBytes.size,marshalToNative(customDataBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDCustomData>(result.getValue())
      return resultValue
    }
  }

  public class INDCustomDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1288259231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDCustomDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d65405ab342448338c9aaf5fdeb22872")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDCustomDataFactory(ptr: Pointer?): WithDefault = INDCustomDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDCustomDataFactory {
      val address = segment.toRawLongValue()
      return makeINDCustomDataFactory(Pointer(address))
    }

    public override fun toNative(obj: INDCustomDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1288259231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDCustomDataFactory): Array<INDCustomDataFactory?> =
        (elements as
        Array<INDCustomDataFactory?>).castToImpl<INDCustomDataFactory,INDCustomDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDCustomDataFactory?> =
        arrayOfNulls<INDCustomDataFactory_Impl>(size) as Array<INDCustomDataFactory?>
  }
}
