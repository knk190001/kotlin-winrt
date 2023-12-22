package Windows.Perception.Spatial

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

@ABIMarker(ISpatialEntityAddedEventArgs.ABI::class)
@Signature("{a397f49b-156a-4707-ac2c-d31d570ed399}")
@Guid("a397f49b156a4707ac2cd31d570ed399")
@WinRTInterface("a397f49b156a4707ac2cd31d570ed399")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityAddedEventArgs.ByReference::class)
public interface ISpatialEntityAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Entity(): SpatialEntity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityAddedEventArgs> {
    public override fun getValue() = ABI.makeISpatialEntityAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityAddedEventArgs {
    public val __1885060731_Ptr: Pointer?

    public val _1885060731_VtblPtr: Pointer?
      get() = __1885060731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Entity(): SpatialEntity? {
      val fnPtr = _1885060731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntity>()
      val hr = fn.invokeHR(arrayOf(__1885060731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntity>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885060731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a397f49b156a4707ac2cd31d570ed399")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityAddedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialEntityAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialEntityAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885060731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityAddedEventArgs):
        Array<ISpatialEntityAddedEventArgs?> = (elements as
        Array<ISpatialEntityAddedEventArgs?>).castToImpl<ISpatialEntityAddedEventArgs,ISpatialEntityAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityAddedEventArgs?> =
        arrayOfNulls<ISpatialEntityAddedEventArgs_Impl>(size) as
        Array<ISpatialEntityAddedEventArgs?>
  }
}
