package Windows.Management.Deployment

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RegisterPackageOptions.ABI::class)
@Signature("rc(Windows.Management.Deployment.RegisterPackageOptions;{677112a7-50d4-496c-8415-0602b4c6d3bf})")
@WinRTByReference(brClass = RegisterPackageOptions.ByReference::class)
public class RegisterPackageOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRegisterPackageOptions.WithDefault, IWinRTObject {
  private val __1241325311_Interface: IRegisterPackageOptions.WithDefault by lazy {
    as_1241325311()
  }


  public override val __1241325311_Ptr: JNAPointer? by lazy {
    __1241325311_Interface.__1241325311_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1241325311_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1241325311(): IRegisterPackageOptions.WithDefault {
    if(pointer == NULL) {
      return(IRegisterPackageOptions.ABI.makeIRegisterPackageOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRegisterPackageOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRegisterPackageOptions.ABI.makeIRegisterPackageOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RegisterPackageOptions> {
    public override fun getValue() = RegisterPackageOptions(pointer.getPointer(0))

    public fun setValue(value: RegisterPackageOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RegisterPackageOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.RegisterPackageOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): RegisterPackageOptions {
      val address = segment.toRawLongValue()
      return RegisterPackageOptions(Pointer(address))
    }

    public override fun toNative(obj: RegisterPackageOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
