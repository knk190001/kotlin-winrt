package Windows.Security.Credentials

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PasswordCredential.ABI::class)
@Signature("rc(Windows.Security.Credentials.PasswordCredential;{6ab18989-c720-41a7-a6c1-feadb36329a0})")
@WinRTByReference(brClass = PasswordCredential.ByReference::class)
public class PasswordCredential(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPasswordCredential.WithDefault, IWinRTObject {
  private val __1463427870_Interface: IPasswordCredential.WithDefault by lazy {
    as_1463427870()
  }


  public override val __1463427870_Ptr: JNAPointer? by lazy {
    __1463427870_Interface.__1463427870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1463427870_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    resource: String,
    userName: String,
    password: String
  ) : this(ABI.activate(resource, userName, password))

  private fun as_1463427870(): IPasswordCredential.WithDefault {
    if(pointer == NULL) {
      return(IPasswordCredential.ABI.makeIPasswordCredential(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordCredential>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordCredential.ABI.makeIPasswordCredential(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PasswordCredential> {
    public override fun getValue() = PasswordCredential(pointer.getPointer(0))

    public fun setValue(value: PasswordCredential): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordCredential, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICredentialFactory_Instance: ICredentialFactory by lazy {
      createICredentialFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.PasswordCredential".toHandle(),
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

    public fun createICredentialFactory(): ICredentialFactory {
      val refiid = Guid.REFIID(ICredentialFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.PasswordCredential".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICredentialFactory.ABI.makeICredentialFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      resource: String,
      userName: String,
      password: String
    ): JNAPointer? = ICredentialFactory_Instance.CreatePasswordCredential(resource, userName,
        password)?.pointer

    public override fun fromNative(segment: MemoryAddress): PasswordCredential {
      val address = segment.toRawLongValue()
      return PasswordCredential(Pointer(address))
    }

    public override fun toNative(obj: PasswordCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
