package Windows.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDependencyPropertyStatics.ABI::class)
@Signature("{49e5f28f-8259-4d5c-aae0-83d56dbb68d9}")
@Guid("49e5f28f82594d5caae083d56dbb68d9")
@WinRTInterface("49e5f28f82594d5caae083d56dbb68d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDependencyPropertyStatics.ByReference::class)
public interface IDependencyPropertyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnsetValue(): IUnknown?

  @InterfaceMethod(1)
  public fun Register(
    name: String?,
    propertyType: TypeName?,
    ownerType: TypeName?,
    typeMetadata: PropertyMetadata?
  ): DependencyProperty?

  @InterfaceMethod(2)
  public fun RegisterAttached(
    name: String?,
    propertyType: TypeName?,
    ownerType: TypeName?,
    defaultMetadata: PropertyMetadata?
  ): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDependencyPropertyStatics> {
    public override fun getValue() = ABI.makeIDependencyPropertyStatics(pointer.getPointer(0))

    public fun setValue(value: IDependencyPropertyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDependencyPropertyStatics {
    public val __1133932717_Ptr: Pointer?

    public val _1133932717_VtblPtr: Pointer?
      get() = __1133932717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnsetValue(): IUnknown? {
      val fnPtr = _1133932717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1133932717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Register(
      name: String?,
      propertyType: TypeName?,
      ownerType: TypeName?,
      typeMetadata: PropertyMetadata?
    ): DependencyProperty? {
      val fnPtr = _1133932717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1133932717_Ptr, marshalToNative(name),
          marshalToNative(propertyType), marshalToNative(ownerType), marshalToNative(typeMetadata),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RegisterAttached(
      name: String?,
      propertyType: TypeName?,
      ownerType: TypeName?,
      defaultMetadata: PropertyMetadata?
    ): DependencyProperty? {
      val fnPtr = _1133932717_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1133932717_Ptr, marshalToNative(name),
          marshalToNative(propertyType), marshalToNative(ownerType),
          marshalToNative(defaultMetadata), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDependencyPropertyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1133932717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDependencyPropertyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49e5f28f82594d5caae083d56dbb68d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDependencyPropertyStatics(ptr: Pointer?): WithDefault =
        IDependencyPropertyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDependencyPropertyStatics {
      val address = segment.toRawLongValue()
      return makeIDependencyPropertyStatics(Pointer(address))
    }

    public override fun toNative(obj: IDependencyPropertyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1133932717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDependencyPropertyStatics):
        Array<IDependencyPropertyStatics?> = (elements as
        Array<IDependencyPropertyStatics?>).castToImpl<IDependencyPropertyStatics,IDependencyPropertyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDependencyPropertyStatics?> =
        arrayOfNulls<IDependencyPropertyStatics_Impl>(size) as Array<IDependencyPropertyStatics?>
  }
}
