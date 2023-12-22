package Windows.ApplicationModel.Resources.Core

import Windows.UI.UIContext
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

@ABIMarker(IResourceContextStatics4.ABI::class)
@Signature("{22eb9ccd-fb31-4bfa-b86b-df9d9d7bdc39}")
@Guid("22eb9ccdfb314bfab86bdf9d9d7bdc39")
@WinRTInterface("22eb9ccdfb314bfab86bdf9d9d7bdc39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContextStatics4.ByReference::class)
public interface IResourceContextStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUIContext(context: UIContext?): ResourceContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContextStatics4> {
    public override fun getValue() = ABI.makeIResourceContextStatics4(pointer.getPointer(0))

    public fun setValue(value: IResourceContextStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContextStatics4 {
    public val __1445083801_Ptr: Pointer?

    public val _1445083801_VtblPtr: Pointer?
      get() = __1445083801_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUIContext(context: UIContext?): ResourceContext? {
      val fnPtr = _1445083801_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1445083801_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }
  }

  public class IResourceContextStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1445083801_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContextStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22eb9ccdfb314bfab86bdf9d9d7bdc39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContextStatics4(ptr: Pointer?): WithDefault =
        IResourceContextStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContextStatics4 {
      val address = segment.toRawLongValue()
      return makeIResourceContextStatics4(Pointer(address))
    }

    public override fun toNative(obj: IResourceContextStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1445083801_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContextStatics4):
        Array<IResourceContextStatics4?> = (elements as
        Array<IResourceContextStatics4?>).castToImpl<IResourceContextStatics4,IResourceContextStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContextStatics4?> =
        arrayOfNulls<IResourceContextStatics4_Impl>(size) as Array<IResourceContextStatics4?>
  }
}
