package Windows.Services.Store

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreAppLicense2.ABI::class)
@Signature("{b4666e91-4443-40b3-993f-28904435bdc6}")
@Guid("b4666e91444340b3993f28904435bdc6")
@WinRTInterface("b4666e91444340b3993f28904435bdc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreAppLicense2.ByReference::class)
public interface IStoreAppLicense2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDiscLicense(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreAppLicense2> {
    public override fun getValue() = ABI.makeIStoreAppLicense2(pointer.getPointer(0))

    public fun setValue(value: IStoreAppLicense2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreAppLicense2 {
    public val __620268894_Ptr: Pointer?

    public val _620268894_VtblPtr: Pointer?
      get() = __620268894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDiscLicense(): Boolean {
      val fnPtr = _620268894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__620268894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStoreAppLicense2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __620268894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreAppLicense2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4666e91444340b3993f28904435bdc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreAppLicense2(ptr: Pointer?): WithDefault = IStoreAppLicense2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreAppLicense2 {
      val address = segment.toRawLongValue()
      return makeIStoreAppLicense2(Pointer(address))
    }

    public override fun toNative(obj: IStoreAppLicense2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__620268894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreAppLicense2): Array<IStoreAppLicense2?> = (elements
        as Array<IStoreAppLicense2?>).castToImpl<IStoreAppLicense2,IStoreAppLicense2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreAppLicense2?> =
        arrayOfNulls<IStoreAppLicense2_Impl>(size) as Array<IStoreAppLicense2?>
  }
}
