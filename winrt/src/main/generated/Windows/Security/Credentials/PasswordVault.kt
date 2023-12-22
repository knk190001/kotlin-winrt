package Windows.Security.Credentials

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

@ABIMarker(PasswordVault.ABI::class)
@Signature("rc(Windows.Security.Credentials.PasswordVault;{61fd2c0b-c8d4-48c1-a54f-bc5a64205af2})")
@WinRTByReference(brClass = PasswordVault.ByReference::class)
public class PasswordVault(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPasswordVault.WithDefault, IWinRTObject {
  private val __1660998343_Interface: IPasswordVault.WithDefault by lazy {
    as_1660998343()
  }


  public override val __1660998343_Ptr: JNAPointer? by lazy {
    __1660998343_Interface.__1660998343_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1660998343_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1660998343(): IPasswordVault.WithDefault {
    if(pointer == NULL) {
      return(IPasswordVault.ABI.makeIPasswordVault(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordVault>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordVault.ABI.makeIPasswordVault(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PasswordVault>
      {
    public override fun getValue() = PasswordVault(pointer.getPointer(0))

    public fun setValue(value: PasswordVault): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordVault, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.PasswordVault".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PasswordVault {
      val address = segment.toRawLongValue()
      return PasswordVault(Pointer(address))
    }

    public override fun toNative(obj: PasswordVault): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
