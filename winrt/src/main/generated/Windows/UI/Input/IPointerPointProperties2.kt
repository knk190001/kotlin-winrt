package Windows.UI.Input

import Windows.Foundation.IReference
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPointerPointProperties2.ABI::class)
@Signature("{22c3433a-c83b-41c0-a296-5e232d64d6af}")
@Guid("22c3433ac83b41c0a2965e232d64d6af")
@WinRTInterface("22c3433ac83b41c0a2965e232d64d6af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPointProperties2.ByReference::class)
public interface IPointerPointProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZDistance(): IReference<Float>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerPointProperties2> {
    public override fun getValue() = ABI.makeIPointerPointProperties2(pointer.getPointer(0))

    public fun setValue(value: IPointerPointProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPointProperties2 {
    public val __1242782338_Ptr: Pointer?

    public val _1242782338_VtblPtr: Pointer?
      get() = __1242782338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZDistance(): IReference<Float>? {
      val fnPtr = _1242782338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1242782338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerPointProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1242782338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPointProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22c3433ac83b41c0a2965e232d64d6af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPointProperties2(ptr: Pointer?): WithDefault =
        IPointerPointProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPointProperties2 {
      val address = segment.toRawLongValue()
      return makeIPointerPointProperties2(Pointer(address))
    }

    public override fun toNative(obj: IPointerPointProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1242782338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPointProperties2):
        Array<IPointerPointProperties2?> = (elements as
        Array<IPointerPointProperties2?>).castToImpl<IPointerPointProperties2,IPointerPointProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPointProperties2?> =
        arrayOfNulls<IPointerPointProperties2_Impl>(size) as Array<IPointerPointProperties2?>
  }
}
