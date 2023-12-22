package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IResourceContextStatics2.ABI::class)
@Signature("{41f752ef-12af-41b9-ab36-b1eb4b512460}")
@Guid("41f752ef12af41b9ab36b1eb4b512460")
@WinRTInterface("41f752ef12af41b9ab36b1eb4b512460")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContextStatics2.ByReference::class)
public interface IResourceContextStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): ResourceContext?

  @InterfaceMethod(1)
  public fun SetGlobalQualifierValue(key: String?, value: String?): Unit

  @InterfaceMethod(2)
  public fun ResetGlobalQualifierValues(): Unit

  @InterfaceMethod(3)
  public fun ResetGlobalQualifierValues(qualifierNames: IIterable<String?>?): Unit

  @InterfaceMethod(4)
  public fun GetForViewIndependentUse(): ResourceContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContextStatics2> {
    public override fun getValue() = ABI.makeIResourceContextStatics2(pointer.getPointer(0))

    public fun setValue(value: IResourceContextStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContextStatics2 {
    public val __1445083799_Ptr: Pointer?

    public val _1445083799_VtblPtr: Pointer?
      get() = __1445083799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): ResourceContext? {
      val fnPtr = _1445083799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1445083799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetGlobalQualifierValue(key: String?, value: String?): Unit {
      val fnPtr = _1445083799_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1445083799_Ptr, marshalToNative(key), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ResetGlobalQualifierValues(): Unit {
      val fnPtr = _1445083799_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1445083799_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ResetGlobalQualifierValues(qualifierNames: IIterable<String?>?): Unit {
      val fnPtr = _1445083799_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1445083799_Ptr, marshalToNative(qualifierNames),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetForViewIndependentUse(): ResourceContext? {
      val fnPtr = _1445083799_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1445083799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }
  }

  public class IResourceContextStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1445083799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContextStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41f752ef12af41b9ab36b1eb4b512460")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContextStatics2(ptr: Pointer?): WithDefault =
        IResourceContextStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContextStatics2 {
      val address = segment.toRawLongValue()
      return makeIResourceContextStatics2(Pointer(address))
    }

    public override fun toNative(obj: IResourceContextStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1445083799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContextStatics2):
        Array<IResourceContextStatics2?> = (elements as
        Array<IResourceContextStatics2?>).castToImpl<IResourceContextStatics2,IResourceContextStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContextStatics2?> =
        arrayOfNulls<IResourceContextStatics2_Impl>(size) as Array<IResourceContextStatics2?>
  }
}
