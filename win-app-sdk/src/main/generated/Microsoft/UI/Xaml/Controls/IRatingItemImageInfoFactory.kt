package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRatingItemImageInfoFactory.ABI::class)
@Signature("{4acc8cac-bca8-5380-95e4-345c1be256b2}")
@Guid("4acc8cacbca8538095e4345c1be256b2")
@WinRTInterface("4acc8cacbca8538095e4345c1be256b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemImageInfoFactory.ByReference::class)
public interface IRatingItemImageInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RatingItemImageInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemImageInfoFactory> {
    public override fun getValue() = ABI.makeIRatingItemImageInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IRatingItemImageInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemImageInfoFactory {
    public val __687911528_Ptr: Pointer?

    public val _687911528_VtblPtr: Pointer?
      get() = __687911528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RatingItemImageInfo? {
      val fnPtr = _687911528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatingItemImageInfo>()
      val hr = fn.invokeHR(arrayOf(__687911528_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatingItemImageInfo>(result.getValue())
      return resultValue
    }
  }

  public class IRatingItemImageInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687911528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemImageInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4acc8cacbca8538095e4345c1be256b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemImageInfoFactory(ptr: Pointer?): WithDefault =
        IRatingItemImageInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemImageInfoFactory {
      val address = segment.toRawLongValue()
      return makeIRatingItemImageInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemImageInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687911528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemImageInfoFactory):
        Array<IRatingItemImageInfoFactory?> = (elements as
        Array<IRatingItemImageInfoFactory?>).castToImpl<IRatingItemImageInfoFactory,IRatingItemImageInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemImageInfoFactory?> =
        arrayOfNulls<IRatingItemImageInfoFactory_Impl>(size) as Array<IRatingItemImageInfoFactory?>
  }
}
